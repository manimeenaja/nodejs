const mongoose = require('mongoose');

const NoteSchema = mongoose.Schema({
    
    msg: String,
    date: Date,
    username: String
}, {
    timestamps: true
});

module.exports = mongoose.model('Note', NoteSchema);
