package org.ochibot.messagecommands.actioncommands;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.channel.unions.MessageChannelUnion;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.awt.*;
import java.util.Random;

public class Blush extends ListenerAdapter {

    public static void blush(MessageReceivedEvent event){

       MessageChannelUnion eventChannel = event.getChannel();
       String eventNickname = event.getMember().getNickname();
       Random random = new Random();
       EmbedBuilder embedBuilder = new EmbedBuilder();

       if (event.getAuthor().getId().equals("840373537952497695")){
           embedBuilder.setTitle("Sonrojado").setDescription(eventNickname + " se puso como tomatito, bien rojo").setColor(Color.ORANGE).setImage("https://media.tenor.com/yMvO56iuwjcAAAAC/the-100-girlfriends-who-really-really-really-really-really-love-you-the-100-girlfriends.gif").setFooter("Si el culpable no fue Kiro, aqui van a rodar cabezas").build();
           eventChannel.asTextChannel().sendMessageEmbeds(embedBuilder.build()).queue();
       }else{
           int randomNumber = random.nextInt(1, 6);
           switch (randomNumber){
               case 1:
                   embedBuilder.setTitle("Sonrojado").setDescription(eventNickname + " se puso como tomatito, bien rojo").setColor(Color.RED).setImage("https://media.tenor.com/1WljoHHuIeoAAAAC/cute.gif").setFooter("Iralo, tod@ penud@").build();
                   eventChannel.asTextChannel().sendMessageEmbeds(embedBuilder.build()).queue();
                   break;
               case 2:
                   embedBuilder.setTitle("Sonrojado").setDescription(eventNickname + " se puso como tomatito, bien rojo").setColor(Color.RED).setImage("https://media.tenor.com/KDPRHWcjUY8AAAAC/yeison.gif").setFooter("Iralo, tod@ penud@").build();
                   eventChannel.asTextChannel().sendMessageEmbeds(embedBuilder.build()).queue();
                   break;
               case 3:
                   embedBuilder.setTitle("Sonrojado").setDescription(eventNickname + " se puso como tomatito, bien rojo").setColor(Color.RED).setImage("https://media.tenor.com/73k5d_LqL2IAAAAC/blushing-anime-anime-girl.gif").setFooter("Iralo, tod@ penud@").build();
                   eventChannel.asTextChannel().sendMessageEmbeds(embedBuilder.build()).queue();
                   break;
               case 4:
                   embedBuilder.setTitle("Sonrojado").setDescription(eventNickname + " se puso como tomatito, bien rojo").setColor(Color.RED).setImage("https://media.tenor.com/0aX8aRI1qCEAAAAC/100-girlfriends-hyakkano.gif").setFooter("Iralo, tod@ penud@").build();
                   eventChannel.asTextChannel().sendMessageEmbeds(embedBuilder.build()).queue();
                   break;
               case 5:
                   embedBuilder.setTitle("Sonrojado").setDescription(eventNickname + " se puso como tomatito, bien rojo").setColor(Color.RED).setImage("https://media.tenor.com/5A5wKR2x7pIAAAAC/princess-connect-kokkoro.gif").setFooter("Iralo, tod@ penud@").build();
                   eventChannel.asTextChannel().sendMessageEmbeds(embedBuilder.build()).queue();
                   break;
               default:
                   embedBuilder.setTitle("WTF").setDescription("Esto no debería pasar, creo rompiste a Chochito").setColor(Color.RED).setImage("https://media.tenor.com/0Uf0-C5vSHMAAAAC/died-of-cringe-anime.gif").setFooter("Pos que hiciste wn").build();
                   eventChannel.asTextChannel().sendMessageEmbeds(embedBuilder.build()).queue();
                   break;
           }
       }
    }
}
