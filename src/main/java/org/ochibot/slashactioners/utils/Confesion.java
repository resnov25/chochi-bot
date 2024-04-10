package org.ochibot.slashactioners.utils;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.interactions.commands.SlashCommandInteraction;
import org.jetbrains.annotations.NotNull;

import java.awt.*;

public class Confesion extends ListenerAdapter {

    @Override
    public void onSlashCommandInteraction(@NotNull SlashCommandInteractionEvent event){
        SlashCommandInteraction interactionEvent = event.getInteraction();
        EmbedBuilder embedBuilder = new EmbedBuilder();

        if (interactionEvent.getOption("anonimo").getAsBoolean()){
            embedBuilder.setColor(Color.BLACK).setTitle("Un anonimo confiesa esto: ").setDescription(interactionEvent.getOption("secreto").getAsString());
        }else {
            embedBuilder.setColor(Color.yellow).setTitle(interactionEvent.getMember().getNickname() + " confiesa lo siguiente: ").setDescription(interactionEvent.getOption("secreto").getAsString());
        }
        event.getChannel().sendMessageEmbeds(embedBuilder.build()).queue();

    }
}
