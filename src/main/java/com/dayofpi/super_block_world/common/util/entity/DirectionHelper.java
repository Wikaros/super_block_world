package com.dayofpi.super_block_world.common.util.entity;

import net.minecraft.entity.LivingEntity;

/**
 * Created by lorinthio on 3/3/2018.
 */
public class DirectionHelper {

    public enum Direction {
        NORTH, EAST, SOUTH, WEST
    }

    /**
     * Get the cardinal compass direction of an entity.
     *
     */
    public static Direction getCardinalDirection(LivingEntity entity) {
        double rot = (entity.getYaw() - 90) % 360;
        if (rot < 0) {
            rot += 360.0;
        }
        return getDirection(rot);
    }

    /**
     * Converts a rotation to a cardinal direction name.
     *
     */
    private static Direction getDirection(double rot) {
        if (27 <= rot && rot < 45) {
            return Direction.WEST;
        } else if (45 <= rot && rot < 135) {
            return Direction.NORTH;
        } else if (135 <= rot && rot <= 225) {
            return Direction.EAST;
        } else if (225 <= rot && rot < 315) {
            return Direction.SOUTH;
        } else if (315 <= rot && rot < 360.0) {
            return Direction.WEST;
        } else {
            return null;
        }
    }

    public static int directionToInt(Direction direction) {
        if (direction == Direction.WEST || direction == Direction.EAST) {
            return 270;
        } else if (direction == Direction.NORTH || direction == Direction.SOUTH) {
            return 0;
        } else {
            return 0;
        }
    }

    public static int directionToIntProperty(Direction direction) {
        if (direction == Direction.WEST)
            return 5;
        if (direction == Direction.EAST)
            return 10;
        if (direction == Direction.NORTH)
            return 15;
        else
            return 0;
    }
}