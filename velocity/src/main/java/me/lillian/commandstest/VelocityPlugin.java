package me.lillian.commandstest;

import com.google.inject.Inject;
import com.velocitypowered.api.event.Subscribe;
import com.velocitypowered.api.event.proxy.ProxyInitializeEvent;
import com.velocitypowered.api.plugin.Plugin;
import com.velocitypowered.api.proxy.ProxyServer;
import org.selyu.commands.core.ICommandService;
import org.selyu.commands.velocity.VelocityCommandService;

@Plugin(id = "commands-test", name = "Commands Test", version = "1.0-SNAPSHOT")
public final class VelocityPlugin {
    private final ProxyServer proxyServer;

    @Inject
    public VelocityPlugin(ProxyServer proxyServer) {
        this.proxyServer = proxyServer;
    }

    @Subscribe
    public void onInit(ProxyInitializeEvent event) {
        ICommandService commandService = new VelocityCommandService(this, proxyServer);
        CommandsTest.registerDefaults(commandService);
        commandService.registerCommands();
    }
}
