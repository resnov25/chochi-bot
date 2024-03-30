package org.ochibot.slashactioners.utils;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.interactions.commands.SlashCommandInteraction;
import org.jetbrains.annotations.NotNull;

import java.awt.*;

public class Sushi extends ListenerAdapter {

    @Override
    public void onSlashCommandInteraction(@NotNull SlashCommandInteractionEvent event){
        SlashCommandInteraction interactionEvent = event.getInteraction();
        EmbedBuilder embedBuilder = new EmbedBuilder();

        embedBuilder.setImage("https://media.tenor.com/BEOmex2Kg8wAAAAd/cat-steals-sushi-cat.gif").setDescription("Mi sushi favorito es de Salmon").setColor(Color.magenta).setTitle("Sushi").setFooter("Mmmm Sushi").build();
        interactionEvent.deferReply().setEmbeds(embedBuilder.build()).queue();
    }
}
