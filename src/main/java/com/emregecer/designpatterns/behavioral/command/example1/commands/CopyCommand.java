package com.emregecer.designpatterns.behavioral.command.example1.commands;

import com.emregecer.designpatterns.behavioral.command.example1.editor.Editor;

public class CopyCommand extends Command {

    public CopyCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        editor.clipboard = editor.textField.getSelectedText();
        return false;
    }
}
