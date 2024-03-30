package org.ochibot.slashcommands;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.interactions.commands.Command;
import net.dv8tion.jda.api.interactions.commands.OptionType;

public class Commands extends ListenerAdapter {

    String guildId = "1013936162030747699";
    public void sushi (JDA jda){
        jda.getGuildById(guildId).upsertCommand("sushi", "Cual será el sushi favorito de Ochi?").queue();
    }

    public void bonk (JDA jda){
        jda.getGuildById(guildId).upsertCommand("bonk", "Pegale a alguien (Solo si se lo merece, o no)").addOption(OptionType.USER, "nombre", "A quien le quieres dar el bonk", true).queue();
    }

    public void hug (JDA jda){
        jda.getGuildById(guildId).upsertCommand("kiss", "Dale un beso a tu persona querida").addOption(OptionType.USER, "kissname", "A quien te gustaria chapar", true).queue();
    }

    public void haremSenal(JDA jda){
        jda.getGuildById(guildId).upsertCommand("harem", "Estas seguro que quieres invocarlas?").queue();
    }

    public void pat(JDA jda){
        jda.getGuildById(guildId).upsertCommand("pat", "Dale un pat pat a quien quieras").addOption(OptionType.USER, "pat", "A quien quieres darle un pat pat?", true).queue();
    }

    public void poke(JDA jda){
        jda.getGuildById(guildId).upsertCommand("poke", "Picale picale picale").addOption(OptionType.USER, "poke", "A quien quieres picar?", true).queue();
    }

    public void fuckiu(JDA jda){
        jda.getGuildById(guildId).upsertCommand("fokiu", "Mientale la madre").addOption(OptionType.USER, "fokiu", "A quien quieres mandar muy lejos?", true).queue();
    }

    public void hiFive(JDA jda){
        jda.getGuildById(guildId).upsertCommand("hi5", "Choca esos 5 con alguien").addOption(OptionType.USER, "chocalas", "Con quien quieres chocar esos 5", true).queue();
    }

    public void stare(JDA jda){
        jda.getGuildById(guildId).upsertCommand("stare", "Clavale la mirada a alguien").addOption(OptionType.USER, "observando", "A quien quieres mirar", true).queue();
    }

    public void coin(JDA jda){
        jda.getGuildById(guildId).upsertCommand("coin", "Lanza una moneda al aire").queue();
    }

    public void valoSenal(JDA jda){ jda.getGuildById(guildId).upsertCommand("valito", "Invoca a gente para que jueguen Valo contigo").queue(); }

    public void saludoAlfa(JDA jda){
        jda.getGuildById(guildId).upsertCommand("saludo_alfa", "Este es el verdadero saludo").queue();
    }
}
