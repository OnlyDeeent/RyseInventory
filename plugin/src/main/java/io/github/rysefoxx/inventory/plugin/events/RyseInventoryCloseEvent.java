/*
 * MIT License
 *
 * Copyright (c) 2022. Rysefoxx
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
 * WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 *
 */

package io.github.rysefoxx.inventory.plugin.events;

import io.github.rysefoxx.inventory.plugin.pagination.RyseInventory;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * @author Rysefoxx | Rysefoxx#6772
 * @since 7/4/2022
 */
public class RyseInventoryCloseEvent extends Event {

    private static final HandlerList HANDLERS_LIST = new HandlerList();

    private final Player player;
    private final RyseInventory inventory;

    /**
     * The event is called after a RyseInventory is closed.
     *
     * @param player    The player who closed the inventory.
     * @param inventory The inventory that was closed.
     * <p>
     * The event is called only when the inventory is closed with the {@link RyseInventory#close(Player)} method.
     */
    public RyseInventoryCloseEvent(@NotNull Player player, @NotNull RyseInventory inventory) {
        this.player = player;
        this.inventory = inventory;
    }

    @Contract(pure = true)
    public static HandlerList getHandlerList() {
        return HANDLERS_LIST;
    }

    /**
     * @return The inventory, which is closed to the player.
     */
    public RyseInventory getInventory() {
        return this.inventory;
    }

    /**
     * @return The player for whom the inventory is closed.
     */
    public @NotNull Player getPlayer() {
        return this.player;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLERS_LIST;
    }
}
