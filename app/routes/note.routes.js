module.exports = (app) => {
    const notes = require('../controllers/note.controller.js');

    // Create a new Note
    app.post('/create-message', notes.create);

    // Retrieve all Notes
    app.get('/messages', notes.findAll);

    // Retrieve a single Note with noteId
    app.get('/messages/:noteId', notes.findOne);

   
}
