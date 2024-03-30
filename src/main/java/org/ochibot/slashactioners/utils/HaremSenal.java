package org.ochibot.slashactioners.utils;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.interactions.commands.SlashCommandInteraction;
import org.jetbrains.annotations.NotNull;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class HaremSenal extends ListenerAdapter {

    public void onSlashCommandInteraction(@NotNull SlashCommandInteractionEvent event){
        SlashCommandInteraction interactionEvent = event.getInteraction();
        String nicknameEvent = event.getMember().getNickname();
        EmbedBuilder embedBuilder = new EmbedBuilder();
        List<String> harem = new ArrayList<>();
        String arti = "1212789594714804244";
        String patitas = "840373537952497695";
        String ochi = "371403664679501856";
        String kiro = "430795212751634432";
        String kaze = "268200631456628736";
        String mimi = "809129726412193822";
        String lalo = "750921582834221096";

        harem.add(arti);
        harem.add(patitas);
        harem.add(ochi);
        harem.add(kaze);
        harem.add(mimi);
        harem.add(lalo);

        if (interactionEvent.getMember().getId().equals(kiro)){
            embedBuilder.setColor(Color.white).setImage("https://media.tenor.com/SGq_aMI4FL8AAAAd/call-me.gif").setDescription("Este es un llamado a todo el harem! <:kiroevil:1138560762554630144>").setAuthor(interactionEvent.getMember().getNickname()).setTitle("Harem señal").setFooter("Ayuden a Kiro, cada dia está mas loco");
            interactionEvent.deferReply().addEmbeds(embedBuilder.build()).addContent(harem.stream().reduce("", (r, h)  -> r + "<@" + h + ">! ")).queue();
        } else if (!interactionEvent.getMember().getId().equals(kiro)) {
            embedBuilder.setColor(Color.red).setImage("https://media.tenor.com/ISSGKfkvs4IAAAAC/anime-angry.gif").setDescription("Ey consiguete el tuyo! " + nicknameEvent + " ! ").setFooter("Envidiosos");
            interactionEvent.deferReply().setEmbeds(embedBuilder.build()).queue();
        }

    }

}
