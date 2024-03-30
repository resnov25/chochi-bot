package org.ochibot.slashactioners;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.interactions.commands.OptionMapping;
import net.dv8tion.jda.api.interactions.commands.SlashCommandInteraction;
import org.jetbrains.annotations.NotNull;

import java.awt.*;

public class SaludoAlfa extends ListenerAdapter {

    String kiro = "430795212751634432";
    String chochi = "371403664679501856";

    @Override
    public void onSlashCommandInteraction(@NotNull SlashCommandInteractionEvent event){
        SlashCommandInteraction interactionEvent = event.getInteraction();
        EmbedBuilder embedBuilder = new EmbedBuilder();

        if (interactionEvent.getMember().getId().equals(kiro)){
            embedBuilder.setTitle("El alfa mayor los saluda").setColor(Color.CYAN).setFooter("Reportese manada").setImage("https://media1.tenor.com/m/_sw_IfaIOXwAAAAC/howling-wolf.gif");
            interactionEvent.deferReply().setEmbeds(embedBuilder.build()).queue();
        }else if (interactionEvent.getMember().getId().equals(chochi)){
            embedBuilder.setTitle("Aqui " + interactionEvent.getMember().getNickname() + " reportandose").setDescription("Aqui no discriminamos razas").setColor(Color.BLUE).setFooter("Miauuuuuuuu").setImage("https://media1.tenor.com/m/o0KwNh5LwK4AAAAC/cat-meow.gif");
            interactionEvent.deferReply().setEmbeds(embedBuilder.build()).queue();
        }else {
            embedBuilder.setTitle("Aqui " + interactionEvent.getMember().getNickname() + " reportandose").setColor(Color.red).setFooter("Auuuuuuuuuuu").setImage("https://media1.tenor.com/m/Dde3GlJ0fM0AAAAd/%D0%B2%D0%BE%D0%BB%D0%BA-%D0%B2%D0%BE%D0%BB%D0%BA%D0%BA%D1%80%D1%83%D0%B6%D0%B8%D1%82%D1%81%D1%8F.gif");
            interactionEvent.deferReply().setEmbeds(embedBuilder.build()).queue();
        }
    }

}
