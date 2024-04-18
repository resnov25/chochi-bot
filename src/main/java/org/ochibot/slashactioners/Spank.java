package org.ochibot.slashactioners;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.interactions.commands.OptionMapping;
import net.dv8tion.jda.api.interactions.commands.SlashCommandInteraction;
import org.jetbrains.annotations.NotNull;

import java.awt.*;
import java.util.Random;

public class Spank extends ListenerAdapter {

    @Override
    public void onSlashCommandInteraction(@NotNull SlashCommandInteractionEvent event){
        SlashCommandInteraction interactionEvent = event.getInteraction();
        OptionMapping optionMapping = interactionEvent.getOption("spank");
        String nicknameEvent = event.getMember().getNickname();
        Random random = new Random();
        EmbedBuilder embedBuilder = new EmbedBuilder();
        int randomNumber = random.nextInt(1, 7);

        switch (randomNumber){
            case 1:
                embedBuilder.setColor(Color.BLUE).setImage("https://media1.tenor.com/m/sdSmiixaAj0AAAAC/anime-anime-girl.gif").setDescription(nicknameEvent + " le dió una tremenda nalgadota a " + "<@" + optionMapping.getAsUser().getName() + ">! ").setFooter("Que rico").setTitle("Nalgadón!!").build();
                interactionEvent.deferReply().setEmbeds(embedBuilder.build()).queue();
                break;
            case 2:
                embedBuilder.setColor(Color.MAGENTA).setImage("https://media1.tenor.com/m/zUEucSznlxwAAAAd/asobi-asobase-school-girl.gif").setDescription(nicknameEvent + " le dió una tremenda nalgadota a " + "<@" + optionMapping.getAsUser().getId() + ">! ").setFooter("Que rico").setTitle("Nalgadón!!").build();
                interactionEvent.deferReply().setEmbeds(embedBuilder.build()).queue();
                break;
            case 3:
                embedBuilder.setColor(Color.RED).setImage("https://media1.tenor.com/m/Dcdf0if-PlsAAAAC/anime-school-girl.gif").setDescription(nicknameEvent + " le dió una tremenda nalgadota a " + "<@" + optionMapping.getAsUser().getId() + ">! ").setFooter("Que rico").setTitle("Nalgadón!!").build();
                interactionEvent.deferReply().setEmbeds(embedBuilder.build()).queue();
                break;
            case 4:
                embedBuilder.setColor(Color.WHITE).setImage("https://media1.tenor.com/m/NBmB6PIpX5sAAAAC/rosario-to-vampire-spanking.gif").setDescription(nicknameEvent + " le dió una tremenda nalgadota a " + "<@" + optionMapping.getAsUser().getId() + ">! ").setFooter("Que rico").setTitle("Nalgadón!!").build();
                interactionEvent.deferReply().setEmbeds(embedBuilder.build()).queue();
                break;
            case 5:
                embedBuilder.setColor(Color.GREEN).setImage("https://media1.tenor.com/m/l_-8WyYoZ0YAAAAd/anime-spank-akebi-chan.gif").setDescription(nicknameEvent + " le dió una tremenda nalgadota a " + "<@" + optionMapping.getAsUser().getId() + ">! ").setFooter("Que rico").setTitle("Nalgadón!!").build();
                interactionEvent.deferReply().setEmbeds(embedBuilder.build()).queue();
                break;
            case 6:
                embedBuilder.setColor(Color.DARK_GRAY).setImage("https://media1.tenor.com/m/jq-PoRYhLYwAAAAC/anime-waifu.gif").setDescription(nicknameEvent + " le dió una tremenda nalgadota a " + "<@" + optionMapping.getAsUser().getId() + ">! ").setFooter("Que rico").setTitle("Nalgadón!!").build();
                interactionEvent.deferReply().setEmbeds(embedBuilder.build()).queue();
                break;
            default:
                interactionEvent.deferReply().addContent("Esto no debía de haber pasado, rompiste el Chochito Bot").queue();
                break;
        }
    }

}
