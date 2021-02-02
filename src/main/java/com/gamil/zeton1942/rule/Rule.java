package com.gamil.zeton1942.rule;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;



public final class Rule extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("Rule-plugin enable");
        Bukkit.getServer().getPluginManager().registerEvents(this,this);


    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("RulePL disable");
    }

    @EventHandler
    public void PlayerJoinEvent(PlayerJoinEvent p){
        Player e = p.getPlayer();

        e.sendTitle("サーバーへようこそ！", "", 1, 34, 30);

        e.sendMessage(ChatColor.GREEN + "///////サーバーのルール//////////////////////////////////");
        e.sendMessage(ChatColor.RED + "<禁止事項>\n");
        e.sendMessage(ChatColor.WHITE +
                "1.誹謗中傷、荒らし行為(窃盗,他人の建物を許可なく破壊する行為)、ゲーム規約に違反する行為(チート,改造等)\n" +
                "\n" +
                "2.サーバーに大きな負担をかける行為。(例)\n" +
                "・ONOFFスイッチの無いクロック回路\n" +
                "・ON状態のままの回路放置\n" +
                "・追加のトラップタワー\n" +
                "・MOBの大量繁殖\n" +
                "・額縁の過度な使用など\n" +
                "\n" );
        e.sendMessage(ChatColor.RED + "禁止事項を守れなかった人は、BAN等の対処をします。\n");
        e.sendMessage(ChatColor.WHITE +"ルールを守って楽しく遊びましょう。");
        e.sendMessage(ChatColor.GREEN + "/////////////////////////////////////////////////////");
        e.sendMessage(ChatColor.YELLOW +"/srule" + ChatColor.WHITE + "で禁止事項を再表示することができます。");
    }

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(command.getName().equals("srule")) {

            Player e = (Player)sender;

            if(!(sender instanceof Player)){
                sender.sendMessage(ChatColor.GREEN + "このプラグインはプレイヤーでなければ実行できません。");
                return true;
            }

            e.sendMessage(ChatColor.GREEN + "///////サーバーのルール//////////////////////////////////");
            e.sendMessage(ChatColor.RED + "<禁止事項>\n");
            e.sendMessage(ChatColor.WHITE +
                    "1.誹謗中傷、荒らし行為(窃盗,他人の建物を許可なく破壊する行為)、ゲーム規約に違反する行為(チート,改造等)\n" +
                    "\n\n" +
                    "2.サーバーに大きな負担をかける行為。(例)\n" +
                    "・ONOFFスイッチの無いクロック回路\n" +
                    "・ON状態のままの回路放置\n" +
                    "・追加のトラップタワー\n" +
                    "・MOBの大量繁殖\n" +
                    "・額縁の過度な使用など\n" +
                    "\n" );
            e.sendMessage(ChatColor.RED + "禁止事項を守れなかった人は、BAN等の対処をします。\n");
            e.sendMessage(ChatColor.WHITE +"ルールを守って楽しく遊びましょう。");
            e.sendMessage(ChatColor.GREEN + "/////////////////////////////////////////////////////");
            e.sendMessage(ChatColor.YELLOW +"/srule" + ChatColor.WHITE + "でサーバーのルールを表示することができます。");
        }
        return false;
    }


}
