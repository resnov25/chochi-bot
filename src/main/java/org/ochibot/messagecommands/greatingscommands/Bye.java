package org.ochibot.messagecommands.greatingscommands;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.channel.unions.MessageChannelUnion;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import okhttp3.EventListener;

import java.awt.*;
import java.util.Random;

public class Bye extends EventListener {

    public static void chochiBye(MessageReceivedEvent event){
        MessageChannelUnion eventChannel = event.getChannel();
        String eventNickname = event.getMember().getNickname();
        Random random = new Random();
        EmbedBuilder embedBuilder = new EmbedBuilder();
        int randomNumber = random.nextInt(1, 6);

        switch (randomNumber){
            case 1:
                embedBuilder.setTitle("Sayonara").setDescription(eventNickname + " se nos va y se despide!").setColor(Color.PINK).setImage("https://media.tenor.com/ktle_yw1QxEAAAAC/bye-finger-gun.gif").setFooter("¿Pues a donde te vas?").build();
                eventChannel.asTextChannel().sendMessageEmbeds(embedBuilder.build()).queue();
                break;
            case 2:
                embedBuilder.setTitle("Sayonara").setDescription(eventNickname + " se nos va y se despide!").setColor(Color.PINK).setImage("https://media.tenor.com/9wzq3wK8NwcAAAAC/sawako-kuronuma-sawako.gif").setFooter("¿Pues a donde te vas?").build();
                eventChannel.asTextChannel().sendMessageEmbeds(embedBuilder.build()).queue();
                break;
            case 3:
                embedBuilder.setTitle("Sayonara").setDescription(eventNickname + " se nos va y se despide!").setColor(Color.PINK).setImage("https://media.tenor.com/CGZ8m0xZA2cAAAAC/sumi-sakurasawa-bye-bye.gif").setFooter("¿Pues a donde te vas?").build();
                eventChannel.asTextChannel().sendMessageEmbeds(embedBuilder.build()).queue();
                break;
            case 4:
                embedBuilder.setTitle("Sayonara").setDescription(eventNickname + " se nos va y se despide!").setColor(Color.PINK).setImage("https://media.tenor.com/oSG6doCX46UAAAAC/shiki-ichinose-idolmaster-cinderella-girls-u149.gif").setFooter("¿Pues a donde te vas?").build();
                eventChannel.asTextChannel().sendMessageEmbeds(embedBuilder.build()).queue();
                break;
            case 5:
                embedBuilder.setTitle("Sayonara").setDescription(eventNickname + " se nos va y se despide!").setColor(Color.PINK).setImage("https://media.tenor.com/1rMglc7lcvgAAAAC/bocchi-bocchi-the-rock.gif").setFooter("¿Pues a donde te vas?").build();
                eventChannel.asTextChannel().sendMessageEmbeds(embedBuilder.build()).queue();
                break;
            default:
                embedBuilder.setTitle("WTF").setDescription("Esto no debería pasar, creo rompiste a Chochito").setColor(Color.PINK).setImage("https://media.tenor.com/0Uf0-C5vSHMAAAAC/died-of-cringe-anime.gif").setFooter("Pos que hiciste wn").build();
                eventChannel.asTextChannel().sendMessageEmbeds(embedBuilder.build()).queue();
                break;
        }
    }
}
