package org.ochibot.messagecommands.greatingscommands;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.channel.unions.MessageChannelUnion;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import okhttp3.EventListener;

import java.awt.*;
import java.util.Random;

public class Hi extends EventListener {

    public static void chochiHi(MessageReceivedEvent event){
        MessageChannelUnion eventChannel = event.getChannel();
        String eventAutorId = event.getMember().getId();
        Random random = new Random();
        EmbedBuilder embedBuilder = new EmbedBuilder();
        int randomNumber = random.nextInt(1, 6);

        switch (randomNumber){
            case 1:
                embedBuilder.setTitle("Hais").setDescription("<@" + eventAutorId + "> saluda a todo el mundo!").setColor(Color.white).setImage("https://media.tenor.com/nQOSTbcTKZcAAAAC/anime-waves-hi.gif").setFooter("Saluden de vuelta perros").build();
                eventChannel.asTextChannel().sendMessageEmbeds(embedBuilder.build()).queue();
                break;
            case 2:
                embedBuilder.setTitle("Hais").setDescription("<@" + eventAutorId + "> saluda a todo el mundo!").setColor(Color.white).setImage("https://media.tenor.com/2wPCzBrKJP8AAAAC/hyper-anime.gif").setFooter("Saluden de vuelta perros").build();
                eventChannel.asTextChannel().sendMessageEmbeds(embedBuilder.build()).queue();
                break;
            case 3:
                embedBuilder.setTitle("Hais").setDescription("<@" + eventAutorId + "> saluda a todo el mundo!").setColor(Color.white).setImage("https://media.tenor.com/WyeIC4hSFUwAAAAC/anime-hi.gif").setFooter("Saluden de vuelta perros").build();
                eventChannel.asTextChannel().sendMessageEmbeds(embedBuilder.build()).queue();
                break;
            case 4:
                embedBuilder.setTitle("Hais").setDescription("<@" + eventAutorId + "> saluda a todo el mundo!").setColor(Color.white).setImage("https://media.tenor.com/73p4U5NiJ30AAAAC/hi-cute.gif").setFooter("Saluden de vuelta perros").build();
                eventChannel.asTextChannel().sendMessageEmbeds(embedBuilder.build()).queue();
                break;
            case 5:
                embedBuilder.setTitle("Hais").setDescription("<@" + eventAutorId + "> saluda a todo el mundo!").setColor(Color.white).setImage("https://media.tenor.com/yz7x6pCVg3oAAAAC/hello-azumanga.gif").setFooter("Saluden de vuelta perros").build();
                eventChannel.asTextChannel().sendMessageEmbeds(embedBuilder.build()).queue();
                break;
            default:
                embedBuilder.setTitle("WTF").setDescription("Esto no debería pasar, creo rompiste a Chochito").setColor(Color.white).setImage("https://media.tenor.com/0Uf0-C5vSHMAAAAC/died-of-cringe-anime.gif").setFooter("Saluden de vuelta perros").build();
                eventChannel.asTextChannel().sendMessageEmbeds(embedBuilder.build()).queue();
                break;
        }
    }
}
