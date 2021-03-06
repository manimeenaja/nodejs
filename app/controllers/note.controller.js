const Note = require('../models/note.model.js');

// Create and Save a new Note
exports.create = (req, res) => {

// Validate request
    if(!req.body.username) {
        return res.status(400).send({
            message: "Note username can not be empty"
        });
    }
    if(!req.body.date) {
        return res.status(400).send({
            message: "Note date can not be empty"
        });
    }
    if(!req.body.msg) {
        return res.status(400).send({
            message: "Note Message can not be empty"
        });
    }

    // Create a Note
    const note = new Note({
        username: req.body.username,
        date: req.body.date,
        msg: req.body.msg

    });

    // Save Note in the database
    note.save()
    .then(data => {
        res.send(data);
    }).catch(err => {
        res.status(500).send({
            message: err.message || "Some error occurred while creating the Note."
        });
    });

};

// Retrieve and return all notes from the database.
exports.findAll = (req, res) => {

Note.find()
    .then(notes => {
        res.send(notes);
    }).catch(err => {
        res.status(500).send({
            message: err.message || "Some error occurred while retrieving notes."
        });
    });

};

// Find a single note with a noteId
exports.findOne = (req, res) => {

Note.findById(req.params.noteId)
    .then(note => {
        if(!note) {
            return res.status(404).send({
                message: "Note not found with id " + req.params.noteId
            });            
        }
        res.send(note);
    }).catch(err => {
        if(err.kind === 'ObjectId') {
            return res.status(404).send({
                message: "Note not found with id " + req.params.noteId
            });                
        }
        return res.status(500).send({
            message: "Error retrieving note with id " + req.params.noteId
        });
    });

};




