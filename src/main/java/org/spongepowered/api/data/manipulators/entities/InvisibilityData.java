/*
 * This file is part of SpongeAPI, licensed under the MIT License (MIT).
 *
 * Copyright (c) SpongePowered <https://www.spongepowered.org>
 * Copyright (c) contributors
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
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package org.spongepowered.api.data.manipulators.entities;

import org.spongepowered.api.data.DataManipulator;
import org.spongepowered.api.entity.Entity;
import org.spongepowered.api.entity.player.Player;

/**
 * Signifies that an {@link Entity} is rendered "invisible" to viewing
 * {@link Player}s.
 */
public interface InvisibilityData extends DataManipulator<InvisibilityData> {

    /**
     * Gets whether this living entity is invisible to the specific
     * {@link Player} entity.
     *
     * @param player The other player to check
     * @return Whether this entity is invisible to the given player
     */
    boolean isInvisibleTo(Player player);

    /**
     * Sets whether this living entity is rendered invisible to the
     * given {@link Player} entity.
     *
     * @param player The player to toggle invisibility towards
     * @param invisible Whether this entity is invisible to the targeted
     *      player
     */
    void setInvisibleTo(Player player, boolean invisible);

}
