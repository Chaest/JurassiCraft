package org.jurassicraft.server.api;

import org.jurassicraft.server.entity.GrowthStage;
import org.jurassicraft.server.entity.OverlayType;

public class GrowthStageGenderContainer {
	
    private GrowthStage growthStage;
    private boolean isMale;

    public GrowthStageGenderContainer(GrowthStage stage, boolean isMale) {
        this.growthStage = stage;
        this.isMale = isMale;
    }

    public GrowthStage getGrowthStage() {
        return this.growthStage;
    }

    public boolean isMale() {
        return this.isMale;
    }

    public boolean isFemale() {
        return !this.isMale();
    }

    @Override
    public int hashCode() {
        return this.growthStage.ordinal() * (this.isMale() ? 1 : 0) * 54;
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof GrowthStageGenderContainer) {
            GrowthStageGenderContainer container = (GrowthStageGenderContainer) object;

            return container.growthStage == this.growthStage && container.isMale == this.isMale;
        }

        return false;
    }
}
