package org.ochibot.slashactioners.utils;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.interactions.commands.SlashCommandInteraction;
import org.jetbrains.annotations.NotNull;

import java.awt.*;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Coin extends ListenerAdapter {

    @Override
    public void onSlashCommandInteraction(@NotNull SlashCommandInteractionEvent event){
        SlashCommandInteraction interactionEvent = event.getInteraction();
        EmbedBuilder embedBuilder = new EmbedBuilder();
        int random = new Random().nextInt(1, 3);

        embedBuilder.setTitle("MONEDA AL AIRE").setImage("https://media.tenor.com/-Ty-f7Ld7skAAAAd/anime-coinflip.gif").setColor(Color.magenta).setFooter("Que va a caer?");
        event.getChannel().asTextChannel().sendMessageEmbeds(embedBuilder.build()).queue();

        switch (random){
            case 1:
                embedBuilder.setTitle("CARA!!").setImage("https://media.tenor.com/K8FWysJyy7gAAAAC/spinning-coin-coin-toss.gif").setColor(Color.LIGHT_GRAY).setFooter("Si apostaste Cruz, mamaste");
                try {
                    TimeUnit.SECONDS.sleep(2);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                interactionEvent.deferReply().setEmbeds(embedBuilder.build()).queue();
                break;
            case 2:
                embedBuilder.setTitle("CRUZ!!").setImage("https://media.tenor.com/mJOTJmC_LMsAAAAd/coin-throw.gif").setColor(Color.LIGHT_GRAY).setFooter("Si apostaste Cara, mamaste");
                try {
                    TimeUnit.SECONDS.sleep(2);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                interactionEvent.deferReply().setEmbeds(embedBuilder.build()).queue();
        }

    }
}
