package org.ochibot.messagecommands.actioncommands;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.channel.unions.MessageChannelUnion;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import okhttp3.EventListener;

import java.awt.*;
import java.util.Random;

public class Clap extends EventListener {

    public static void Clap(MessageReceivedEvent event){
        MessageChannelUnion eventChannel = event.getChannel();
        String eventAutorId = event.getMember().getId();
        Random random = new Random();
        EmbedBuilder embedBuilder = new EmbedBuilder();
        int randomNumber = random.nextInt(1, 6);

        switch (randomNumber){
            case 1:
                embedBuilder.setTitle("Bravisimo").setColor(Color.ORANGE).setImage("https://media.tenor.com/jncqY9-RbqcAAAAd/mushoku-tensei-roxy.gif").setDescription("<@" + eventAutorId + "> te aplaude, te felicita o está muy contento").setFooter("Clap, clap, clap");
                eventChannel.asTextChannel().sendMessageEmbeds(embedBuilder.build()).queue();
                break;
            case 2:
                embedBuilder.setTitle("Bravisimo").setColor(Color.ORANGE).setImage("https://media.tenor.com/zVvMxtmpRaMAAAAC/taiga-asaka-clapping.gif").setDescription("<@" + eventAutorId + "> te aplaude, te felicita o está muy contento").setFooter("Clap, clap, clap");
                eventChannel.asTextChannel().sendMessageEmbeds(embedBuilder.build()).queue();
                break;
            case 3:
                embedBuilder.setTitle("Bravisimo").setColor(Color.ORANGE).setImage("https://media.tenor.com/USdY6pi_97gAAAAC/anime-bocchi.gif").setDescription("<@" + eventAutorId + "> te aplaude, te felicita o está muy contento").setFooter("Clap, clap, clap");
                eventChannel.asTextChannel().sendMessageEmbeds(embedBuilder.build()).queue();
                break;
            case 4:
                embedBuilder.setTitle("Bravisimo").setColor(Color.ORANGE).setImage("https://media.tenor.com/VWWYG8OJN1oAAAAC/mushoku-tensei-eris.gif").setDescription("<@" + eventAutorId + "> te aplaude, te felicita o está muy contento").setFooter("Clap, clap, clap");
                eventChannel.asTextChannel().sendMessageEmbeds(embedBuilder.build()).queue();
                break;
            case 5:
                embedBuilder.setTitle("Bravisimo").setColor(Color.ORANGE).setImage("https://media.tenor.com/ut_gt2plNH4AAAAC/pokemon-pikachu.gif").setDescription("<@" + eventAutorId + "> te aplaude, te felicita o está muy contento").setFooter("Clap, clap, clap");
                eventChannel.asTextChannel().sendMessageEmbeds(embedBuilder.build()).queue();
                break;
            default:
                embedBuilder.setTitle("WTF").setDescription("Esto no debería pasar, creo rompiste a Chochito").setColor(Color.white).setImage("https://media.tenor.com/0Uf0-C5vSHMAAAAC/died-of-cringe-anime.gif").setFooter("Te voy a cobrar el chochito Bot");
                eventChannel.asTextChannel().sendMessageEmbeds(embedBuilder.build()).queue();
                break;
        }
    }
}