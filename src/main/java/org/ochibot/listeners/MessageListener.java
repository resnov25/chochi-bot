package org.ochibot.listeners;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.entities.channel.middleman.MessageChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;
import org.ochibot.messagecommands.actioncommands.Blush;
import org.ochibot.messagecommands.actioncommands.Chaketa;
import org.ochibot.messagecommands.actioncommands.Clap;
import org.ochibot.messagecommands.actioncommands.Dance;
import org.ochibot.messagecommands.greatingscommands.Bye;
import org.ochibot.messagecommands.greatingscommands.Hi;

import java.awt.*;
import java.time.Duration;

public class MessageListener extends ListenerAdapter {

    @Override
    public void onMessageReceived(@NotNull MessageReceivedEvent event){

        String eventMessage = event.getMessage().getContentRaw();
        MessageChannel eventChannel = event.getChannel();
        User eventAuthor = event.getAuthor();
        Member eventMember = event.getMember();
        EmbedBuilder embedBuilder = new EmbedBuilder();

        System.out.println("---Message received---");
        System.out.println(event.getChannel());
        System.out.println(eventMessage);
        System.out.println(eventMember);
        System.out.println(eventMember.getId());
        System.out.println("---End Of Message---");
        System.out.println("");

        if (!eventAuthor.isBot() && eventMessage.equalsIgnoreCase("Neko bonk <@430795212751634432>") || eventMessage.equalsIgnoreCase("Neko bonk 430795212751634432")){
            event.getMember().timeoutFor(Duration.ofSeconds(120)).queue();
            eventChannel.sendMessage("Eso no fue muy correcto de tu parte " + eventMember.getNickname()).queue();
            eventChannel.sendMessage("Adios popo").queue();
        }

        if (!eventAuthor.isBot() && eventMessage.equalsIgnoreCase("tengo miedo")){
            eventChannel.sendMessage("No tengas miedo " + eventAuthor.getName() + " aqui estoy contigo").queue();
        }

        //if (!eventAuthor.isBot() && eventMessage.toLowerCase().contains("patitas") && !eventMember.getId().equals("430795212751634432")){
        //    eventChannel.sendMessage("Ey ey ey, te estoy vigilando " + eventAuthor.getName() + ", patitas es de Kiro").queue();
        //}

        if (!eventAuthor.isBot() && eventMessage.contains("amo") && eventMessage.contains("<@1174010085668819014>")){
            eventChannel.sendMessage("Yo tambien te amo " + eventMember.getNickname() + " <a:knuckles:1164257014046789632>").queue();
        }

        if (!eventAuthor.isBot() && eventMessage.equalsIgnoreCase("Quien es el harem")){
            eventChannel.sendMessage("El harem está compuesto por:  " +
                    "Patitas, " +
                    "Ochi, " +
                    "Kaze " +
                    "Mimi " +
                    "y Arti" +
                    ". Todas ellas tan unicas y bellas" + "<:simp:1131098711691370557>").queue();
        }

        if (eventMessage.equalsIgnoreCase("Por las buenas o por las malas")){
            embedBuilder.setImage("https://media.tenor.com/WJkViTH_9lgAAAAC/voxterego-voxed.gif").setDescription("Por las malas ALV").build();
            eventChannel.sendMessageEmbeds(embedBuilder.build()).queue();
        }

        if (!eventAuthor.isBot() && eventMember.getRoles().stream().anyMatch(e -> e.getName().contains("novias")) && eventMessage.toLowerCase().contains("verdad que si?")){
            eventChannel.sendMessage("Sisisisisi, tiene toda la razon " + "<@" + event.getMember().getUser().getId() + ">").queue();
        }

        if (eventMessage.equalsIgnoreCase("chochi hi") ){
            Hi.chochiHi(event);
        }

        if (eventMessage.equalsIgnoreCase("chochi bye")){
            Bye.chochiBye(event);
        }

        if (eventMessage.equalsIgnoreCase("chochi blush")){
            Blush.blush(event);
        }
        if (eventMessage.equalsIgnoreCase("chochi clap")){
            Clap.Clap(event);
        }
        if (eventMessage.equalsIgnoreCase("chochi dance")){
            Dance.Dance(event);
        }
        if (eventMessage.equalsIgnoreCase("chochi shaketon") && eventMember.getRoles().stream().anyMatch(e -> e.getName().toLowerCase().contains("legales"))){
            Chaketa.Chaketa(event);
        }else if(eventMessage.equalsIgnoreCase("chochi shaketearse")){
            embedBuilder.setTitle("Niño precoz").setFooter("Ponte a ver a los Backyardigans mejor").setImage("https://media1.tenor.com/m/6dWfOEJwQyMAAAAC/anime-facepalm.gif").setColor(Color.CYAN).setDescription("<@" + eventAuthor.getId() + "> primero aprende a limpiarte la cola");
            eventChannel.sendMessageEmbeds(embedBuilder.build()).queue();
        }
        if (eventMessage.equalsIgnoreCase("good boy") ){
            embedBuilder.setTitle("Aqui solo Alfas").setColor(Color.BLACK).setFooter("Y el Alfa mayor es Kiro").setImage("https://media1.tenor.com/m/7szSH6i35l4AAAAd/funny-emo.gif");
            eventChannel.sendMessageEmbeds(embedBuilder.build()).queue();
        }
    }
}
