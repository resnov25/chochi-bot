package org.ochibot.slashactioners;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.interactions.Interaction;
import net.dv8tion.jda.api.interactions.commands.OptionMapping;
import net.dv8tion.jda.api.interactions.commands.SlashCommandInteraction;
import org.jetbrains.annotations.NotNull;

import java.awt.*;
import java.util.Random;

public class HiFive extends ListenerAdapter {

    @Override
    public void onSlashCommandInteraction(@NotNull SlashCommandInteractionEvent event){
        SlashCommandInteraction interactionEvent = event.getInteraction();
        String nicknameEvent = event.getMember().getNickname();
        Random random = new Random();
        EmbedBuilder embedBuilder = new EmbedBuilder();
        OptionMapping optionMapping = interactionEvent.getOption("chocalas");
        int randomNumber = random.nextInt(1 , 6);

        switch (randomNumber){
            case 1:
                embedBuilder.setColor(Color.LIGHT_GRAY).setImage("https://media.tenor.com/YCub_pFV2uAAAAAd/anime-high.gif").setDescription(nicknameEvent + " le da esos 5 a " + "<@" + optionMapping.getAsMember().getId() + ">! ").setFooter("Que buenos amigos");
                interactionEvent.deferReply().addEmbeds(embedBuilder.build()).queue();
                break;
            case 2:
                embedBuilder.setColor(Color.LIGHT_GRAY).setImage("https://media.tenor.com/JBBZ9mQntx8AAAAC/anime-high-five.gif").setDescription(nicknameEvent + " le da esos 5 a " + "<@" + optionMapping.getAsMember().getId() + ">! ").setFooter("Que buenos amigos");
                interactionEvent.deferReply().addEmbeds(embedBuilder.build()).queue();
                break;
            case 3:
                embedBuilder.setColor(Color.LIGHT_GRAY).setImage("https://media.tenor.com/uJ4U79P2uFEAAAAC/hunter-x-hunter-high-five.gif").setDescription(nicknameEvent + " le da esos 5 a " + "<@" + optionMapping.getAsMember().getId() + ">! ").setFooter("Que buenos amigos");
                interactionEvent.deferReply().addEmbeds(embedBuilder.build()).queue();
                break;
            case 4:
                embedBuilder.setColor(Color.LIGHT_GRAY).setImage("https://media.tenor.com/CgEgvxLKjkIAAAAC/space-i-think.gif").setDescription(nicknameEvent + " le da esos 5 a " + "<@" + optionMapping.getAsMember().getId() + ">! ").setFooter("Que buenos amigos");
                interactionEvent.deferReply().addEmbeds(embedBuilder.build()).queue();
                break;
            case 5:
                embedBuilder.setColor(Color.LIGHT_GRAY).setImage("https://media.tenor.com/TLs2q6CGdu4AAAAC/haikyu-hinata.gif").setDescription(nicknameEvent + " le da esos 5 a " + "<@" + optionMapping.getAsMember().getId() + ">! ").setFooter("Que buenos amigos");
                interactionEvent.deferReply().addEmbeds(embedBuilder.build()).queue();
                break;
            default:
                interactionEvent.deferReply().addContent("Esto no debia de haber pasado, rompiste el Chochito bot").queue();
                break;
        }

    }
}
