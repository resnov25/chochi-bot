package org.ochibot.slashactioners;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.interactions.commands.OptionMapping;
import net.dv8tion.jda.api.interactions.commands.SlashCommandInteraction;
import org.jetbrains.annotations.NotNull;

import java.awt.*;
import java.util.Random;

public class Bonk extends ListenerAdapter {

    @Override
    public void onSlashCommandInteraction(@NotNull SlashCommandInteractionEvent event){
        OptionMapping optionMapping = event.getOption("nombre");
        SlashCommandInteraction interactionEvent = event.getInteraction();
        String eventMemberId = event.getMember().getId();
        Random random = new Random();
        EmbedBuilder embedBuilder = new EmbedBuilder();

        if (optionMapping == null){
            interactionEvent.getHook().sendMessage("No dijiste a quien le quieres dar un bonk, por eso bonk a ti!").queue();
        }else{
            int randomNumber = random.nextInt(1, 6);

            switch (randomNumber){
                case 1:
                    embedBuilder.setColor(Color.DARK_GRAY).setImage("https://media.tenor.com/tfgcD7qcy1cAAAAC/bonk.gif").setDescription("<@" + eventMemberId + "> le ha dado un bonkazo a <@" + optionMapping.getAsUser().getId() + ">!").setTitle("Bonkazo").setFooter("Dale con la silla!");
                    interactionEvent.deferReply().setEmbeds(embedBuilder.build()).queue();
                    break;

                case 2:
                    embedBuilder.setColor(Color.DARK_GRAY).setImage("https://media.tenor.com/onXBTwunE5kAAAAC/riamu-idolmaster.gif").setDescription("<@" + eventMemberId + "> le ha dado un bonkazo a <@" + optionMapping.getAsUser().getId() + ">!").setTitle("Bonkazo").setFooter("Dale con la silla!");
                    interactionEvent.deferReply().setEmbeds(embedBuilder.build()).queue();
                    break;

                case 3:
                    embedBuilder.setColor(Color.DARK_GRAY).setImage("https://media.tenor.com/yGk_Te0sywsAAAAC/spongebob-meme-bonk.gif").setDescription("<@" + eventMemberId + "> le ha dado un bonkazo a <@" + optionMapping.getAsUser().getId() + ">!").setTitle("Bonkazo").setFooter("Dale con la silla!");
                    interactionEvent.deferReply().setEmbeds(embedBuilder.build()).queue();
                    break;

                case 4:
                    embedBuilder.setColor(Color.DARK_GRAY).setImage("https://media.tenor.com/H8UQXvtj9RwAAAAC/anime-bonk.gif").setDescription("<@" + eventMemberId + "> le ha dado un bonkazo a <@" + optionMapping.getAsUser().getId() + ">!").setTitle("Bonkazo").setFooter("Dale con la silla!");
                    interactionEvent.deferReply().setEmbeds(embedBuilder.build()).queue();
                    break;

                case 5:
                    embedBuilder.setColor(Color.DARK_GRAY).setImage("https://media.tenor.com/NS2upjfHs6wAAAAC/bonk.gif").setDescription("<@" + eventMemberId + "> le ha dado un bonkazo a <@" + optionMapping.getAsUser().getId() + ">!").setTitle("Bonkazo").setFooter("Dale con la silla!");
                    interactionEvent.deferReply().setEmbeds(embedBuilder.build()).queue();
                    break;

                default:
                    embedBuilder.setTitle("WTF").setDescription("Esto no debería pasar, creo rompiste a Chochito").setColor(Color.RED).setImage("https://media.tenor.com/0Uf0-C5vSHMAAAAC/died-of-cringe-anime.gif").setFooter("Pos que hiciste wn").build();
                    event.deferReply().setEmbeds(embedBuilder.build()).queue();
                    break;
            }
        }
    }

}
