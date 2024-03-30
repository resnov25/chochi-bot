package org.ochibot.listeners;

import net.dv8tion.jda.api.events.guild.voice.GuildVoiceUpdateEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

public class CallListeners extends ListenerAdapter {

    @Override
    public void onGuildVoiceUpdate(@NotNull GuildVoiceUpdateEvent event){

        String yura = "1154835471621427302";
        String eventMember = event.getMember().getId();

        System.out.println("----START CALL LISTENER----");
        System.out.println(event.getChannelJoined());
        System.out.println(event.getNewValue());
        System.out.println(eventMember);
        System.out.println("----END CALL LISTENER----");

        if (eventMember.equals(yura)){
            event.getMember().mute(true).reason("Por Zorra").and(event.getChannelJoined().asGuildMessageChannel().sendMessage("iu, se unió Yura")).queue();
        }


    }

}
