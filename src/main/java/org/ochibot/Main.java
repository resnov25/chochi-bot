package org.ochibot;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.requests.GatewayIntent;
import org.ochibot.listeners.CallListeners;
import org.ochibot.listeners.MessageListener;
import org.ochibot.listeners.SlashListeners;
import org.ochibot.slashcommands.Commands;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        JDA bot = JDABuilder.createDefault("MTE3NDAxMDA4NTY2ODgxOTAxNA.GuFPHJ.vCqP6LNVttK1rGUrRFthZnGPOqlrjyC5NBKopE")
                .enableIntents(GatewayIntent.MESSAGE_CONTENT)
                .setActivity(Activity.customStatus("Esperando el sushi"))
                .addEventListeners(new MessageListener())
                .addEventListeners(new SlashListeners())
                .addEventListeners(new CallListeners())
                .build().awaitReady();

        Commands commands = new Commands();
        commands.sushi(bot);
        commands.bonk(bot);
        commands.hug(bot);
        commands.saludoAlfa(bot);
        commands.haremSenal(bot);
        commands.pat(bot);
        commands.poke(bot);
        commands.fuckiu(bot);
        commands.hiFive(bot);
        commands.stare(bot);
        commands.coin(bot);
        commands.valoSenal(bot);
        commands.spank(bot);

    }
}