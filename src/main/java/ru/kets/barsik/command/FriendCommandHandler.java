package ru.kets.barsik.command;

import discord4j.core.object.entity.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.kets.barsik.integrations.DogClient;

@Component("friend")
public class FriendCommandHandler implements MessageCommandHandler {

    @Autowired
    private DogClient dogClient;

    @Override
    public String command(Message eventMessage) {
        return dogClient.getImage();
    }
}
