package com.emregecer.designpatterns.behavioral.mediator.example1.mediator;

import com.emregecer.designpatterns.behavioral.mediator.example1.components.Component;

import javax.swing.*;

/**
 * Common mediator interface.
 */
public interface Mediator {
    void addNewNote(Note note);

    void deleteNote();

    void getInfoFromList(Note note);

    void saveChanges();

    void markNote();

    void clear();

    void sendToFilter(ListModel listModel);

    void setElementsList(ListModel list);

    void registerComponent(Component component);

    void hideElements(boolean flag);

    void createGUI();
}
