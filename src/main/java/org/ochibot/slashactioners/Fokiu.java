package org.ochibot.slashactioners;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.interactions.commands.OptionMapping;
import net.dv8tion.jda.api.interactions.commands.SlashCommandInteraction;
import org.jetbrains.annotations.NotNull;

import java.awt.*;
import java.util.Random;

public class Fokiu extends ListenerAdapter {

    @Override
    public void onSlashCommandInteraction(@NotNull SlashCommandInteractionEvent event){
        SlashCommandInteraction interactionEvent = event.getInteraction();
        String nicknameEvent = event.getMember().getNickname();
        Random random = new Random();
        EmbedBuilder embedBuilder = new EmbedBuilder();
        OptionMapping optionMapping = interactionEvent.getOption("fokiu");
        int randomNumber = random.nextInt(1, 6);
        String kiro = "430795212751634432";

        if (optionMapping.getAsUser().getId().equals(kiro)){
            embedBuilder.setColor(Color.white).setImage("https://media.tenor.com/aF0ipAtOk9cAAAAC/spy-x-family-anya.gif").setDescription(nicknameEvent + " ah no no, picate la cola tu con el " + "<@" + optionMapping.getAsUser().getId() + "> no !").setFooter("Fukiu tu").setTitle("Fokiu").build();
            interactionEvent.deferReply().setEmbeds(embedBuilder.build()).queue();
        }else
            switch (randomNumber){
                case 1:
                    embedBuilder.setColor(Color.red).setImage("https://media.tenor.com/eSiR-TcUZqgAAAAC/oniai-anastasia-nasuhara.gif").setDescription(nicknameEvent + " le anda diciendo a " + "<@" + optionMapping.getAsUser().getId() + "> que csm ! ").setFooter("Ey, con las madrecitas no").setTitle("Fokiu").build();
                    interactionEvent.deferReply().setEmbeds(embedBuilder.build()).queue();
                    break;
                case 2:
                    embedBuilder.setColor(Color.red).setImage("https://media.tenor.com/0CrbRX_WsMkAAAAC/anime-animu.gif").setDescription(nicknameEvent + " le anda diciendo a " + "<@" + optionMapping.getAsUser().getId() + "> que csm ! ").setFooter("Ey, con las madrecitas no").setTitle("Fokiu").build();
                    interactionEvent.deferReply().setEmbeds(embedBuilder.build()).queue();
                    break;
                case 3:
                    embedBuilder.setColor(Color.red).setImage("https://media.tenor.com/F9GEgC0k3xIAAAAC/naruto-anime.gif").setDescription(nicknameEvent + " le anda diciendo a " + "<@" + optionMapping.getAsUser().getId() + "> que csm ! ").setFooter("Ey, con las madrecitas no").setTitle("Fokiu").build();
                    interactionEvent.deferReply().setEmbeds(embedBuilder.build()).queue();
                    break;
                case 4:
                    embedBuilder.setColor(Color.red).setImage("https://media.tenor.com/8A0rvVI08O4AAAAd/anime-middle-finger.gif").setDescription(nicknameEvent + " le anda diciendo a " + "<@" + optionMapping.getAsUser().getId() + "> que csm ! ").setFooter("Ey, con las madrecitas no").setTitle("Fokiu").build();
                    interactionEvent.deferReply().setEmbeds(embedBuilder.build()).queue();
                    break;
                case 5:
                    embedBuilder.setColor(Color.red).setImage("https://media.tenor.com/iuwWq7XDOOYAAAAC/vegeta-middle.gif").setDescription(nicknameEvent + " le anda diciendo a " + "<@" + optionMapping.getAsUser().getId() + "> que csm ! ").setFooter("Ey, con las madrecitas no").setTitle("Fokiu").build();
                    interactionEvent.deferReply().setEmbeds(embedBuilder.build()).queue();
                    break;
                default:
                    interactionEvent.deferReply().addContent("Esto no debía de haber pasado, rompiste el Chochito Bot").queue();
                    break;
            }
    }
}
