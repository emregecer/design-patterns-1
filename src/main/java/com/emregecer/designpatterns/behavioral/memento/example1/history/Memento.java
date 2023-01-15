package com.emregecer.designpatterns.behavioral.memento.example1.history;

import com.emregecer.designpatterns.behavioral.memento.example1.editor.Editor;

public class Memento {

    private final String backup;
    private final Editor editor;

    public Memento(Editor editor) {
        this.editor = editor;
        this.backup = editor.backup();
    }

    public void restore() {
        editor.restore(backup);
    }
}
