package org.ochibot.slashactioners;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.interactions.commands.OptionMapping;
import net.dv8tion.jda.api.interactions.commands.SlashCommandInteraction;
import org.jetbrains.annotations.NotNull;

import java.awt.*;
import java.util.Random;

public class Pat extends ListenerAdapter {

    @Override
    public void onSlashCommandInteraction(@NotNull SlashCommandInteractionEvent event){
        SlashCommandInteraction interactionEvent = event.getInteraction();
        OptionMapping optionMapping = interactionEvent.getOption("pat");
        String nicknameEvent = event.getMember().getNickname();
        Random random = new Random();
        EmbedBuilder embedBuilder = new EmbedBuilder();
        int randomNumber = random.nextInt(1, 6);

        switch (randomNumber){
            case 1:
                embedBuilder.setColor(Color.BLUE).setImage("https://media.tenor.com/N41zKEDABuUAAAAC/anime-head-pat-anime-pat.gif").setDescription(nicknameEvent + " le da un bonito pat pat a " + optionMapping.getAsUser().getName()).setFooter("Que Wonito").setTitle("Pat pat").build();
                interactionEvent.deferReply().setEmbeds(embedBuilder.build()).queue();
                break;
            case 2:
                embedBuilder.setColor(Color.BLUE).setImage("https://media.tenor.com/E7Ll04_an30AAAAC/anime-pat.gif").setDescription(nicknameEvent + " le da un bonito pat pat a " + "<@" + optionMapping.getAsUser().getId() + ">! ").setFooter("Que Wonito").setTitle("Pat pat").build();
                interactionEvent.deferReply().setEmbeds(embedBuilder.build()).queue();
                break;
            case 3:
                embedBuilder.setColor(Color.BLUE).setImage("https://media.tenor.com/Z5ehormjOfIAAAAC/headpats-anime.gif").setDescription(nicknameEvent + " le da un bonito pat pat a " + "<@" + optionMapping.getAsUser().getId() + ">! ").setFooter("Que Wonito").setTitle("Pat pat").build();
                interactionEvent.deferReply().setEmbeds(embedBuilder.build()).queue();
                break;
            case 4:
                embedBuilder.setColor(Color.BLUE).setImage("https://media.tenor.com/fro6pl7src0AAAAC/hugtrip.gif").setDescription(nicknameEvent + " le da un bonito pat pat a " + "<@" + optionMapping.getAsUser().getId() + ">! ").setFooter("Que Wonito").setTitle("Pat pat").build();
                interactionEvent.deferReply().setEmbeds(embedBuilder.build()).queue();
                break;
            case 5:
                embedBuilder.setColor(Color.BLUE).setImage("https://media.tenor.com/V1Txxwwe0d8AAAAC/anime-head-pat-anime.gif").setDescription(nicknameEvent + " le da un bonito pat pat a " + "<@" + optionMapping.getAsUser().getId() + ">! ").setFooter("Que Wonito").setTitle("Pat pat").build();
                interactionEvent.deferReply().setEmbeds(embedBuilder.build()).queue();
                break;
            default:
                interactionEvent.deferReply().addContent("Esto no debía de haber pasado, rompiste el Chochito Bot").queue();
                break;
        }
    }

}
