package org.ochibot.slashactioners;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.interactions.commands.OptionMapping;
import net.dv8tion.jda.api.interactions.commands.SlashCommandInteraction;
import org.jetbrains.annotations.NotNull;

import java.awt.*;
import java.util.Random;

public class Stare extends ListenerAdapter {

    @Override
    public void onSlashCommandInteraction(@NotNull SlashCommandInteractionEvent event){
        SlashCommandInteraction interactionEvent = event.getInteraction();
        String eventMemberId = event.getMember().getId();
        Random random = new Random();
        EmbedBuilder embedBuilder = new EmbedBuilder();
        OptionMapping optionMapping = interactionEvent.getOption("observando");
        String optionMappingId = optionMapping.getAsUser().getId();
        int randomNumber = random.nextInt(1, 6);

        switch (randomNumber){
            case 1:
                embedBuilder.setColor(Color.BLACK).setImage("https://media.tenor.com/1fgzvqahPHAAAAAd/bocchi-bocchi-the-rock.gif").setDescription("<@" + eventMemberId + "> observa fijamente a <@" + optionMappingId + ">! " ).setFooter("Cuidadito y hagas algo").setTitle("Stare").build();
                event.deferReply().setEmbeds(embedBuilder.build()).queue();
                break;
            case 2:
                embedBuilder.setColor(Color.BLACK).setImage("https://media.tenor.com/1opLl5UEkR4AAAAC/lamy-stare-anime-stare.gif").setDescription("<@" + eventMemberId + "> observa fijamente a <@" + optionMappingId + ">! " ).setFooter("Cuidadito y hagas algo").setTitle("Stare").build();
                event.deferReply().setEmbeds(embedBuilder.build()).queue();
                break;
            case 3:
                embedBuilder.setColor(Color.BLACK).setImage("https://media.tenor.com/I47e2LllasEAAAAd/inugami-korone-yandere.gif").setDescription("<@" + eventMemberId + "> observa fijamente a <@" + optionMappingId + ">! " ).setFooter("Cuidadito y hagas algo").setTitle("Stare").build();
                event.deferReply().setEmbeds(embedBuilder.build()).queue();
                break;
            case 4:
                embedBuilder.setColor(Color.BLACK).setImage("https://media.tenor.com/EsKHl_LUAsgAAAAC/anime.gif").setDescription("<@" + eventMemberId + "> observa fijamente a <@" + optionMappingId + ">! " ).setFooter("Cuidadito y hagas algo").setTitle("Stare").build();
                event.deferReply().setEmbeds(embedBuilder.build()).queue();
                break;
            case 5:
                embedBuilder.setColor(Color.BLACK).setImage("https://media.tenor.com/MkDiyBeOlV4AAAAC/jessie-james.gif").setDescription("<@" + eventMemberId + "> observa fijamente a <@" + optionMappingId + ">! " ).setFooter("Cuidadito y hagas algo").setTitle("Stare").build();
                event.deferReply().setEmbeds(embedBuilder.build()).queue();
                break;
            default:
                embedBuilder.setTitle("WTF").setDescription("Esto no debería pasar, creo rompiste a Chochito").setColor(Color.RED).setImage("https://media.tenor.com/0Uf0-C5vSHMAAAAC/died-of-cringe-anime.gif").setFooter("Pos que hiciste wn").build();
                event.deferReply().setEmbeds(embedBuilder.build()).queue();
                break;
        }
    }
}
