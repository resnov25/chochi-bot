package org.ochibot.slashactioners;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.interactions.commands.OptionMapping;
import net.dv8tion.jda.api.interactions.commands.SlashCommandInteraction;
import org.jetbrains.annotations.NotNull;

import java.awt.*;
import java.util.Random;

public class Poke extends ListenerAdapter {

    @Override
    public void onSlashCommandInteraction(@NotNull SlashCommandInteractionEvent event){
        SlashCommandInteraction interactionEvent = event.getInteraction();
        String eventAutorId = event.getMember().getId();
        Random random = new Random();
        EmbedBuilder embedBuilder = new EmbedBuilder();
        OptionMapping optionMapping = interactionEvent.getOption("poke");
        int randomNumber = random.nextInt(1, 6);
        String kiro = "430795212751634432";
        String patitas = "840373537952497695";

        if (interactionEvent.getMember().getId().equals(kiro) && optionMapping.getAsUser().getId().equals(patitas)){
            embedBuilder.setColor(Color.BLUE).setImage("https://media.tenor.com/MS7x-A5SsNkAAAAC/boob-poke.gif").setDescription("<@" + eventAutorId + "> pica pica pica a " + "<@" + optionMapping.getAsUser().getId() + ">! ").setFooter("Pues que le hiciste?").setTitle("Pico pico picoton").build();
            interactionEvent.deferReply().setEmbeds(embedBuilder.build()).queue();
        }else
            switch (randomNumber){
                case 1:
                    embedBuilder.setColor(Color.BLUE).setImage("https://media.tenor.com/XdfQaUIW4coAAAAC/poke.gif").setDescription("<@" + eventAutorId + "> pica pica pica a " + "<@" + optionMapping.getAsUser().getId() + ">! ").setFooter("Pues que le hiciste?").setTitle("Pico pico picoton");
                    interactionEvent.deferReply().setEmbeds(embedBuilder.build()).queue();
                    break;
                case 2:
                    embedBuilder.setColor(Color.BLUE).setImage("https://media.tenor.com/0wPms8tS0eoAAAAC/boop-poke.gif").setDescription("<@" + eventAutorId + "> pica pica pica a " + "<@" + optionMapping.getAsUser().getId() + ">! ").setFooter("Pues que le hiciste?").setTitle("Pico pico picoton");
                    interactionEvent.deferReply().setEmbeds(embedBuilder.build()).queue();
                    break;
                case 3:
                    embedBuilder.setColor(Color.BLUE).setImage("https://media.tenor.com/gMqsQ1wwbhgAAAAC/anime-poke.gif").setDescription("<@" + eventAutorId + "> pica pica pica a " + "<@" + optionMapping.getAsUser().getId() + ">! ").setFooter("Pues que le hiciste?").setTitle("Pico pico picoton");
                    interactionEvent.deferReply().setEmbeds(embedBuilder.build()).queue();
                    break;
                case 4:
                    embedBuilder.setColor(Color.BLUE).setImage("https://media.tenor.com/5j7eivfftw8AAAAC/poke.gif").setDescription("<@" + eventAutorId + "> pica pica pica a " + "<@" + optionMapping.getAsUser().getId() + ">! ").setFooter("Pues que le hiciste?").setTitle("Pico pico picoton");
                    interactionEvent.deferReply().setEmbeds(embedBuilder.build()).queue();
                    break;
                case 5:
                    embedBuilder.setColor(Color.BLUE).setImage("https://media.tenor.com/ySdxnfxoTrUAAAAC/ascendence-of-a-bookworm-bookworm-anime.gif").setDescription("<@" + eventAutorId + "> pica pica pica a " + "<@" + optionMapping.getAsUser().getId() + ">! ").setFooter("Pues que le hiciste?").setTitle("Pico pico picoton");
                    interactionEvent.deferReply().setEmbeds(embedBuilder.build()).queue();
                    break;
                default:
                    embedBuilder.setTitle("WTF").setDescription("Esto no debería pasar, creo rompiste a Chochito").setColor(Color.white).setImage("https://media.tenor.com/0Uf0-C5vSHMAAAAC/died-of-cringe-anime.gif").setFooter("Te voy a cobrar el chochito Bot");
                    interactionEvent.deferReply().setEmbeds(embedBuilder.build()).queue();
                    break;
            }
    }
}
