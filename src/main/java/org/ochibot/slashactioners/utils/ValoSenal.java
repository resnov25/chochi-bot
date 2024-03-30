package org.ochibot.slashactioners.utils;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.interactions.commands.SlashCommandInteraction;
import org.jetbrains.annotations.NotNull;

import java.awt.*;
import java.util.List;
import java.util.Random;

public class ValoSenal extends ListenerAdapter {

    @Override
    public void onSlashCommandInteraction(@NotNull SlashCommandInteractionEvent event) {
        Random random = new Random();
        SlashCommandInteraction interactionEvent = event.getInteraction();
        EmbedBuilder embedBuilder = new EmbedBuilder();
        String autorId = event.getInteraction().getMember().getId();
        int randomNumber = random.nextInt(1, 6);
        String rolValo = "1202071390149156864";

        switch (randomNumber) {
            case 1:
                embedBuilder.setTitle("Valo señal perros").setDescription("Ya se armaron los balazos" + "<@" + autorId + "> los invoca " + "<@" + rolValo + ">").setColor(Color.RED).setImage("https://media1.tenor.com/m/BDwCditpC48AAAAC/valorant.gif").setFooter("Al menos ganen mancos").build();
                interactionEvent.deferReply().setEmbeds(embedBuilder.build()).queue();
                break;
            case 2:
                embedBuilder.setTitle("Valo señal perros").setDescription("Ya se armaron los balazos" + "<@" + autorId + "> los invoca " + "<@" + rolValo + ">").setColor(Color.RED).setImage("https://media1.tenor.com/m/DAdk_8-pod4AAAAC/valorant-chamber.gif").setFooter("Al menos ganen mancos").build();
                interactionEvent.deferReply().setEmbeds(embedBuilder.build()).queue();
                break;
            case 3:
                embedBuilder.setTitle("Valo señal perros").setDescription("Ya se armaron los balazos" + "<@" + autorId + "> los invoca " + "<@" + rolValo + ">").setColor(Color.RED).setImage("https://media1.tenor.com/m/1AhknU3iSYAAAAAC/brimstone-valorant-brimstone.gif").setFooter("Al menos ganen mancos").build();
                interactionEvent.deferReply().setEmbeds(embedBuilder.build()).queue();
                break;
            case 4:
                embedBuilder.setTitle("Valo señal perros").setDescription("Ya se armaron los balazos" + "<@" + autorId + "> los invoca " + "<@" + rolValo + ">").setColor(Color.RED).setImage("https://media1.tenor.com/m/xOPucmdcDXYAAAAd/hasbulla.gif").setFooter("Al menos ganen mancos").build();
                interactionEvent.deferReply().setEmbeds(embedBuilder.build()).queue();
                break;
            case 5:
                embedBuilder.setTitle("Valo señal perros").setDescription("Ya se armaron los balazos" + "<@" + autorId + "> los invoca " + "<@" + rolValo + ">").setColor(Color.RED).setImage("https://media1.tenor.com/m/lSflRMQECFYAAAAC/sage-valorant.gif").setFooter("Al menos ganen mancos").build();
                interactionEvent.deferReply().setEmbeds(embedBuilder.build()).queue();
                break;
            default:
                embedBuilder.setTitle("WTF").setDescription("Esto no debería pasar, creo rompiste a Chochito").setColor(Color.white).setImage("https://media.tenor.com/0Uf0-C5vSHMAAAAC/died-of-cringe-anime.gif").setFooter("Te voy a cobrar el chochito Bot").build();
                interactionEvent.deferReply().setEmbeds(embedBuilder.build()).queue();
                break;
        }

    }
}
