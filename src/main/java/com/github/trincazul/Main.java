package com.github.trincazul;
import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;

public class Main {

    public static void main(String[] args) {
        // Só colocar o token aqui !
        String token = "token";

        DiscordApi api = new DiscordApiBuilder().setToken(token).login().join();

        // escuta do bot
        api.addMessageCreateListener(event -> {
            if (event.getMessage().getContent().equalsIgnoreCase("!status")) {
                event.getChannel().sendMessage("Okay");
            }
            if (event.getMessage().getContent().equalsIgnoreCase("!teste")) {
                event.getChannel().sendMessage("teste de bot ok");
            }
            if (event.getMessage().getContent().equalsIgnoreCase("!start")) {
                event.getChannel().sendMessage("tudo compelto !");
            }

        });

        // Print para invitar a url do bot
        System.out.println("Codigo de Invitar Bot " + api.createBotInvite());
    }

}
