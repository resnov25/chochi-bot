package org.ochibot.listeners;

import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.interactions.commands.SlashCommandInteraction;
import org.jetbrains.annotations.NotNull;
import org.ochibot.slashactioners.*;
import org.ochibot.slashactioners.utils.Coin;
import org.ochibot.slashactioners.utils.HaremSenal;
import org.ochibot.slashactioners.utils.Sushi;
import org.ochibot.slashactioners.utils.ValoSenal;

import java.util.concurrent.TimeUnit;


public class SlashListeners extends ListenerAdapter {

    @Override
    public void onSlashCommandInteraction(@NotNull SlashCommandInteractionEvent event) {
        SlashCommandInteraction interactionEvent = event.getInteraction();
/////////////////////////////////////SUSHI////////////////////////////////////////////////////////
        if (interactionEvent.getName().equals("sushi")){
            Sushi sushi = new Sushi();
            sushi.onSlashCommandInteraction(event);
        }
/////////////////////////////////////BONK////////////////////////////////////////////////////////
        if (interactionEvent.getName().equals("bonk") && interactionEvent.getOption("nombre").getAsUser().getId().equals("430795212751634432")){
            event.deferReply().addContent("Eso no fue muy correcto de tu parte <@" + event.getMember().getId() + ">! adios popo!").queue();
            event.getMember().timeoutFor(60, TimeUnit.SECONDS).queue();
        }else if (interactionEvent.getName().equals("bonk")){
            Bonk bonk = new Bonk();
            bonk.onSlashCommandInteraction(event);
        }
/////////////////////////////////////KISS////////////////////////////////////////////////////////
        if (interactionEvent.getName().equals("kiss")){
            Kiss kiss = new Kiss();
            kiss.onSlashCommandInteraction(event);
        }
/////////////////////////////////////HAREM SENAL////////////////////////////////////////////////////////
        if (interactionEvent.getName().equals("harem")){
            HaremSenal haremSenal = new HaremSenal();
            haremSenal.onSlashCommandInteraction(event);
        }
/////////////////////////////////////PAT PAT////////////////////////////////////////////////////////
        if (interactionEvent.getName().equals("pat")){
            Pat pat = new Pat();
            pat.onSlashCommandInteraction(event);
        }
/////////////////////////////////////POKE////////////////////////////////////////////////////////
        if (interactionEvent.getName().equals("poke")){
            Poke poke = new Poke();
            poke.onSlashCommandInteraction(event);
        }
/////////////////////////////////////Fokiu////////////////////////////////////////////////////////
        if (interactionEvent.getName().equals("fokiu")){
            Fokiu fokiu = new Fokiu();
            fokiu.onSlashCommandInteraction(event);
        }
/////////////////////////////////////Hi 5////////////////////////////////////////////////////////
        if (interactionEvent.getName().equals("hi5")){
            HiFive hiFive = new HiFive();
            hiFive.onSlashCommandInteraction(event);
        }
/////////////////////////////////////Stare////////////////////////////////////////////////////////
        if (interactionEvent.getName().equals("stare")){
            Stare stare = new Stare();
            stare.onSlashCommandInteraction(event);
        }
/////////////////////////////////////Coin////////////////////////////////////////////////////////
        if (interactionEvent.getName().equals("coin")){
            Coin coin = new Coin();
            coin.onSlashCommandInteraction(event);
        }
/////////////////////////////////////Valo Señal////////////////////////////////////////////////////////
        if (interactionEvent.getName().equals("valito")){
            ValoSenal valoSenal = new ValoSenal();
            valoSenal.onSlashCommandInteraction(event);
        }
/////////////////////////////////////Alfa Señal////////////////////////////////////////////////////////
        if (interactionEvent.getName().equals("saludo_alfa")){
            SaludoAlfa saludoAlfa = new SaludoAlfa();
            saludoAlfa.onSlashCommandInteraction(event);
        }

    }
}
