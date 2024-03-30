package org.ochibot.messagecommands.actioncommands;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.channel.unions.MessageChannelUnion;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.awt.*;
import java.util.Random;

public class Stare extends ListenerAdapter {


    public static void Stare (MessageReceivedEvent event){
        MessageChannelUnion eventChannel = event.getChannel();
        String eventNickname = event.getMember().getNickname();
        Random random = new Random();
        EmbedBuilder embedBuilder = new EmbedBuilder();

        int randomNumber = random.nextInt(1, 6);
        switch (randomNumber){
            case 1:
                embedBuilder.setTitle("Observando").setImage("").setDescription("").setColor(Color.BLACK).setFooter("Cuidadito y hagas algo").build();
                break;
        }
    }
}
