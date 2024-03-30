package org.ochibot.messagecommands.actioncommands;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.channel.unions.MessageChannelUnion;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.awt.*;
import java.util.Random;

public class Dance extends ListenerAdapter {

    public static void Dance(MessageReceivedEvent event){
        MessageChannelUnion eventChannel = event.getChannel();
        String eventAutorId = event.getMember().getId();
        Random random = new Random();
        EmbedBuilder embedBuilder = new EmbedBuilder();
        int randomNumber;
        randomNumber = random.nextInt(1, 6);

        switch (randomNumber){
            case 1:
                embedBuilder.setTitle("Solo solo solo").setColor(Color.RED).setDescription("<@" + eventAutorId + "> se anda echando un cumbion bien loco!").setFooter("Alguien avientele un billete").setImage("https://media.tenor.com/7_QlCQgfgroAAAAd/dance-anime-dance.gif");
                eventChannel.asTextChannel().sendMessageEmbeds(embedBuilder.build()).queue();
                break;
            case 2:
                embedBuilder.setTitle("Solo solo solo").setColor(Color.RED).setDescription("<@" + eventAutorId + "> se anda echando un cumbion bien loco!").setFooter("Alguien avientele un billete").setImage("https://media.tenor.com/M7-Ftr7tsz8AAAAC/dance.gif");
                eventChannel.asTextChannel().sendMessageEmbeds(embedBuilder.build()).queue();
                break;
            case 3:
                embedBuilder.setTitle("Solo solo solo").setColor(Color.RED).setDescription("<@" + eventAutorId + "> se anda echando un cumbion bien loco!").setFooter("Alguien avientele un billete").setImage("https://media.tenor.com/_vskzHJCcWwAAAAd/anime-dance.gif");
                eventChannel.asTextChannel().sendMessageEmbeds(embedBuilder.build()).queue();
                break;
            case 4:
                embedBuilder.setTitle("Solo solo solo").setColor(Color.RED).setDescription("<@" + eventAutorId + "> se anda echando un cumbion bien loco!").setFooter("Alguien avientele un billete").setImage("https://media.tenor.com/JMJHzfB_960AAAAC/shigure-ui-dance.gif");
                eventChannel.asTextChannel().sendMessageEmbeds(embedBuilder.build()).queue();
                break;
            case 5:
                embedBuilder.setTitle("Solo solo solo").setColor(Color.RED).setDescription("<@" + eventAutorId + "> se anda echando un cumbion bien loco!").setFooter("Alguien avientele un billete").setImage("https://media.tenor.com/hq5dqmwSBw8AAAAd/oicolatcho-anime.gif");
                eventChannel.asTextChannel().sendMessageEmbeds(embedBuilder.build()).queue();
                break;
            default:
                embedBuilder.setTitle("WTF").setDescription("Esto no debería pasar, creo rompiste a Chochito").setColor(Color.white).setImage("https://media.tenor.com/0Uf0-C5vSHMAAAAC/died-of-cringe-anime.gif").setFooter("Te voy a cobrar el chochito Bot");
                eventChannel.asTextChannel().sendMessageEmbeds(embedBuilder.build()).queue();
                break;
        }
    }
}
