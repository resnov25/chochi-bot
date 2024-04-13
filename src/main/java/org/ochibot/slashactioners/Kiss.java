package org.ochibot.slashactioners;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.interactions.commands.OptionMapping;
import net.dv8tion.jda.api.interactions.commands.SlashCommandInteraction;
import org.jetbrains.annotations.NotNull;

import java.awt.*;
import java.util.Random;

public class Kiss extends ListenerAdapter {

    @Override
    public void onSlashCommandInteraction(@NotNull SlashCommandInteractionEvent event){
        SlashCommandInteraction interactionEvent = event.getInteraction();
        String autorId = event.getInteraction().getMember().getId();
        Random random = new Random();
        EmbedBuilder embedBuilder = new EmbedBuilder();
        OptionMapping optionMapping = interactionEvent.getOption("kissname");
        int randomNumber = random.nextInt(1, 9);

        switch (randomNumber){

            case 1:
                embedBuilder.setColor(Color.DARK_GRAY).setImage("https://media.tenor.com/jnndDmOm5wMAAAAC/kiss.gif").setDescription("Pero mira ese beso <@" + autorId + "> le anda metiendo lengua a <@" + optionMapping.getAsUser().getId() + ">! ").setTitle("MUA").setFooter("Consiganse un cuarto");
                interactionEvent.deferReply().setEmbeds(embedBuilder.build()).queue();
                break;

            case 2:
                embedBuilder.setColor(Color.red).setImage("https://media.tenor.com/NZUQilMD3IIAAAAd/horimiya-izumi-miyamura.gif").setDescription("Pero mira ese beso <@" + autorId + "> le anda metiendo lengua a <@" + optionMapping.getAsUser().getId() + ">! ").setTitle("MUA").setFooter("Consiganse un cuarto");
                interactionEvent.deferReply().setEmbeds(embedBuilder.build()).queue();
                break;

            case 3:
                embedBuilder.setColor(Color.CYAN).setImage("https://media.tenor.com/dn_KuOESmUYAAAAM/engage-kiss-anime-kiss.gif").setDescription("Pero mira ese beso <@" + autorId + "> le anda metiendo lengua a <@" + optionMapping.getAsUser().getId() + ">! ").setTitle("MUA").setFooter("Consiganse un cuarto");
                interactionEvent.deferReply().setEmbeds(embedBuilder.build()).queue();
                break;

            case 4:
                embedBuilder.setColor(Color.yellow).setImage("https://media1.tenor.com/m/lyuW54_wDU0AAAAd/kiss-anime.gif").setDescription("Pero mira ese beso <@" + autorId + "> le anda metiendo lengua a <@" + optionMapping.getAsUser().getId() + ">! ").setTitle("MUA").setFooter("Consiganse un cuarto");
                interactionEvent.deferReply().setEmbeds(embedBuilder.build()).queue();
                break;

            case 5:
                embedBuilder.setColor(Color.GREEN).setImage("https://media.tenor.com/Fyq9izHlreQAAAAM/my-little-monster-haru-yoshida.gif").setDescription("Pero mira ese beso <@" + autorId + "> le anda metiendo lengua a <@" + optionMapping.getAsUser().getId() + ">! ").setTitle("MUA").setFooter("Consiganse un cuarto");
                interactionEvent.deferReply().setEmbeds(embedBuilder.build()).queue();
                break;

            case 6:
                embedBuilder.setColor(Color.BLUE).setImage("https://media1.tenor.com/m/ye6xtORyw_8AAAAC/2.gif").setDescription("Pero mira ese beso <@" + autorId + "> le anda metiendo lengua a <@" + optionMapping.getAsUser().getId() + ">! ").setTitle("MUA").setFooter("Consiganse un cuarto");
                interactionEvent.deferReply().setEmbeds(embedBuilder.build()).queue();
                break;

            case 7:
                embedBuilder.setColor(Color.WHITE).setImage("https://media1.tenor.com/m/OGyQDLedJWwAAAAC/lesbian-anime.gif").setDescription("Pero mira ese beso <@" + autorId + "> le anda metiendo lengua a <@" + optionMapping.getAsUser().getId() + ">! ").setTitle("MUA").setFooter("Consiganse un cuarto");
                interactionEvent.deferReply().setEmbeds(embedBuilder.build()).queue();
                break;

            case 8:
                embedBuilder.setColor(Color.MAGENTA).setImage("https://media1.tenor.com/m/kyM-QWHWy1cAAAAC/anime-kissing.gif").setDescription("Pero mira ese beso <@" + autorId + "> le anda metiendo lengua a <@" + optionMapping.getAsUser().getId() + ">! ").setTitle("MUA").setFooter("Consiganse un cuarto");
                interactionEvent.deferReply().setEmbeds(embedBuilder.build()).queue();
                break;

            default:
                embedBuilder.setTitle("WTF").setDescription("Esto no debería pasar, creo rompiste a Chochito").setColor(Color.white).setImage("https://media.tenor.com/0Uf0-C5vSHMAAAAC/died-of-cringe-anime.gif").setFooter("Te voy a cobrar el chochito Bot").build();
                interactionEvent.deferReply().setEmbeds(embedBuilder.build()).queue();
                break;
        }
    }

}
