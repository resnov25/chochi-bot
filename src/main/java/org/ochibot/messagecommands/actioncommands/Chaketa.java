package org.ochibot.messagecommands.actioncommands;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.channel.unions.MessageChannelUnion;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import okhttp3.EventListener;

import java.awt.*;
import java.util.Random;

public class Chaketa extends EventListener {

    public static void Chaketa(MessageReceivedEvent event){
        MessageChannelUnion eventChannel = event.getChannel();
        String eventAutorId = event.getMember().getId();
        Random random = new Random();
        EmbedBuilder embedBuilder = new EmbedBuilder();
        int randomNumber = random.nextInt(1, 6);

        switch (randomNumber){
            case 1:
                embedBuilder.setColor(Color.LIGHT_GRAY).setImage("https://media1.tenor.com/m/jbi8aaaDYqgAAAAC/lewd-jerk-off.gif").setTitle("SHAKETON MAQUIAVELICO").setFooter("¿En quien estará pensando?").setDescription("<@" + eventAutorId + "> Se anda shaketeando, niños tapense los ojos");
                eventChannel.sendMessageEmbeds(embedBuilder.build()).queue();
                break;

            case 2:
                embedBuilder.setColor(Color.LIGHT_GRAY).setImage("https://media1.tenor.com/m/FMoeUhucV5IAAAAC/anime.gif").setTitle("SHAKETON MAQUIAVELICO").setFooter("¿En quien estará pensando?").setDescription("<@" + eventAutorId + "> Se anda shaketeando, niños tapense los ojos");
                eventChannel.sendMessageEmbeds(embedBuilder.build()).queue();
                break;

            case 3:
                embedBuilder.setColor(Color.LIGHT_GRAY).setImage("https://media1.tenor.com/m/77nHxTeIfkAAAAAC/my-dress-up-darling-gojo.gif").setTitle("SHAKETON MAQUIAVELICO").setFooter("¿En quien estará pensando?").setDescription("<@" + eventAutorId + "> Se anda shaketeando, niños tapense los ojos");
                eventChannel.sendMessageEmbeds(embedBuilder.build()).queue();
                break;

            case 4:
                embedBuilder.setColor(Color.LIGHT_GRAY).setImage("https://media1.tenor.com/m/Z0EDBq8ILX8AAAAC/sayonara-zetsubou-sensei-tail.gif").setTitle("SHAKETON MAQUIAVELICO").setFooter("¿En quien estará pensando?").setDescription("<@" + eventAutorId + "> Se anda shaketeando, niños tapense los ojos");
                eventChannel.sendMessageEmbeds(embedBuilder.build()).queue();
                break;

            case 5:
                embedBuilder.setColor(Color.LIGHT_GRAY).setImage("https://media1.tenor.com/m/EOAsE_23wtoAAAAd/31%C3%A7eken-kurba%C4%9Fa-31.gif").setTitle("SHAKETON MAQUIAVELICO").setFooter("¿En quien estará pensando?").setDescription("<@" + eventAutorId + "> Se anda shaketeando, niños tapense los ojos");
                eventChannel.sendMessageEmbeds(embedBuilder.build()).queue();
                break;

            default:
                embedBuilder.setTitle("WTF").setDescription("Esto no debería pasar, creo rompiste a Chochito").setColor(Color.white).setImage("https://media.tenor.com/0Uf0-C5vSHMAAAAC/died-of-cringe-anime.gif").setFooter("Te voy a cobrar el chochito Bot");
                eventChannel.asTextChannel().sendMessageEmbeds(embedBuilder.build()).queue();
                break;
        }
    }

}
