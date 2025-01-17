package ru.kets.barsik.command;

import discord4j.core.object.entity.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.kets.barsik.integrations.FoxClient;

@Component("fox")
public class FoxCommandHandler implements MessageCommandHandler {
    @Autowired
    private FoxClient foxClient;

    @Override
    public String command(Message eventMessage) {
        return foxClient.getImage();
    }
}
