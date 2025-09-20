package com.example.datetimeplugin;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.ui.Messages;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ShowDateTimeAction extends AnAction {
    public ShowDateTimeAction() {
        super("Show Date/Time");
    }

    @Override
    public void actionPerformed(AnActionEvent e) {
        String now = LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        Messages.showInfoMessage(e.getProject(), now, "Current Date/Time");
    }
}
