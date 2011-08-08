package com.Khorn.PTMBukkit;

public enum BiomeTerrainValues
{
    biomeTerrainSettingsName("PhoenixTerrainModSettings.ini"),
    xLimit(16),
    zLimit(16),
    yLimit(128),
    maxChunkBlockValue(32768),
    biomeSize(1.5D),
    minMoisture(0.0D),
    maxMoisture(1.0D),
    minTemperature(0.0D),
    maxTemperature(1.0D),
    snowThreshold(0.5D),
    iceThreshold(0.5D),
    swampSize(2),
    desertDirtFrequency(0),
    muddySwamps(false),
    claySwamps(false),
    waterlessDeserts(false),
    desertDirt(false),
    removeSurfaceDirtFromDesert(false),

    waterLevel(64),
    maxAverageHeight(0.0D),
    maxAverageDepth(0.0D),
    fractureHorizontal(0.0D),
    fractureVertical(0.0D),
    volatility1(0.0D),
    volatility2(0.0D),
    volatilityWeight1(0.5D),
    volatilityWeight2(0.45D),
    removeSurfaceStone(false),
    // --Commented out by Inspection (17.07.11 1:05):replaceWaterWithLava(false),
    // --Commented out by Inspection (17.07.11 1:05):replaceIceWithLava(false),
    disableBedrock(false),
    flatBedrock(false),
    bedrockobsidian(false),
    disableNotchPonds(false),
    denyObjectsUnderFill(false),

    caveRarity(7),
    caveFrequency(40),
    caveMinAltitude(8),
    caveMaxAltitude(128),
    individualCaveRarity(25),
    caveSystemFrequency(1),
    caveSystemPocketChance(0),
    caveSystemPocketMinSize(0),
    caveSystemPocketMaxSize(4),
    evenCaveDistribution(false),
    dungeonRarity(100),
    dungeonFrequency(8),
    dungeonMinAltitude(0),
    dungeonMaxAltitude(128),
    lavaLevelMin(0),
    lavaLevelMax(10),

    undergroundLakeFrequency(2),
    undergroundLakeRarity(5),
    undergroundLakeMinSize(40),
    undergroundLakeMaxSize(60),
    undergroundLakeMinAltitude(0),
    undergroundLakeMaxAltitude(50),
    undergroundLakes(true),
    undergroundLakesInAir(true),

    customObjects(true),
    objectSpawnRatio(2),
    notchBiomeTrees(true),
    globalTreeDensity(0),
    rainforestTreeDensity(5),
    swamplandTreeDensity(0),
    seasonalforestTreeDensity(2),
    forestTreeDensity(5),
    savannaTreeDensity(0),
    shrublandTreeDensity(0),
    taigaTreeDensity(5),
    desertTreeDensity(-20),
    plainsTreeDensity(-20),
    iceDesertTreeDensity(-20),
    tundraTreeDensity(-20),
    globalCactusDensity(0),
    desertCactusDensity(10),
    cactusDepositRarity(100),
    cactusDepositMinAltitude(0),
    cactusDepositMaxAltitude(128),
    flowerDepositRarity(100),
    flowerDepositFrequency(2),
    flowerDepositMinAltitude(0),
    flowerDepositMaxAltitude(128),
    roseDepositRarity(50),
    roseDepositFrequency(1),
    roseDepositMinAltitude(0),
    roseDepositMaxAltitude(128),
    brownMushroomDepositRarity(25),
    brownMushroomDepositFrequency(1),
    brownMushroomDepositMinAltitude(0),
    brownMushroomDepositMaxAltitude(128),
    redMushroomDepositRarity(13),
    redMushroomDepositFrequency(1),
    redMushroomDepositMinAltitude(0),
    redMushroomDepositMaxAltitude(128),
    reedDepositRarity(100),
    reedDepositFrequency(10),
    reedDepositMinAltitude(0),
    reedDepositMaxAltitude(128),
    pumpkinDepositRarity(3),
    pumpkinDepositFrequency(1),
    pumpkinDepositMinAltitude(0),
    pumpkinDepositMaxAltitude(128),
    waterSourceDepositRarity(100),
    waterSourceDepositFrequency(50),
    waterSourceDepositMinAltitude(8),
    waterSourceDepositMaxAltitude(128),
    lavaSourceDepositRarity(100),
    lavaSourceDepositFrequency(20),
    lavaSourceDepositMinAltitude(8),
    lavaSourceDepositMaxAltitude(128),
    dirtDepositRarity1(100),
    dirtDepositFrequency1(20),
    dirtDepositSize1(32),
    dirtDepositMinAltitude1(0),
    dirtDepositMaxAltitude1(128),
    dirtDepositRarity2(0),
    dirtDepositFrequency2(0),
    dirtDepositSize2(0),
    dirtDepositMinAltitude2(0),
    dirtDepositMaxAltitude2(0),
    dirtDepositRarity3(0),
    dirtDepositFrequency3(0),
    dirtDepositSize3(0),
    dirtDepositMinAltitude3(0),
    dirtDepositMaxAltitude3(0),
    dirtDepositRarity4(0),
    dirtDepositFrequency4(0),
    dirtDepositSize4(0),
    dirtDepositMinAltitude4(0),
    dirtDepositMaxAltitude4(0),
    gravelDepositRarity1(100),
    gravelDepositFrequency1(10),
    gravelDepositSize1(32),
    gravelDepositMinAltitude1(0),
    gravelDepositMaxAltitude1(128),
    gravelDepositRarity2(0),
    gravelDepositFrequency2(0),
    gravelDepositSize2(0),
    gravelDepositMinAltitude2(0),
    gravelDepositMaxAltitude2(0),
    gravelDepositRarity3(0),
    gravelDepositFrequency3(0),
    gravelDepositSize3(0),
    gravelDepositMinAltitude3(0),
    gravelDepositMaxAltitude3(0),
    gravelDepositRarity4(0),
    gravelDepositFrequency4(0),
    gravelDepositSize4(0),
    gravelDepositMinAltitude4(0),
    gravelDepositMaxAltitude4(0),
    clayDepositRarity1(100),
    clayDepositFrequency1(10),
    clayDepositSize1(32),
    clayDepositMinAltitude1(0),
    clayDepositMaxAltitude1(128),
    clayDepositRarity2(0),
    clayDepositFrequency2(0),
    clayDepositSize2(0),
    clayDepositMinAltitude2(0),
    clayDepositMaxAltitude2(0),
    clayDepositRarity3(0),
    clayDepositFrequency3(0),
    clayDepositSize3(0),
    clayDepositMinAltitude3(0),
    clayDepositMaxAltitude3(0),
    clayDepositRarity4(0),
    clayDepositFrequency4(0),
    clayDepositSize4(0),
    clayDepositMinAltitude4(0),
    clayDepositMaxAltitude4(0),
    coalDepositRarity1(100),
    coalDepositFrequency1(20),
    coalDepositSize1(16),
    coalDepositMinAltitude1(0),
    coalDepositMaxAltitude1(128),
    coalDepositRarity2(0),
    coalDepositFrequency2(0),
    coalDepositSize2(0),
    coalDepositMinAltitude2(0),
    coalDepositMaxAltitude2(0),
    coalDepositRarity3(0),
    coalDepositFrequency3(0),
    coalDepositSize3(0),
    coalDepositMinAltitude3(0),
    coalDepositMaxAltitude3(0),
    coalDepositRarity4(0),
    coalDepositFrequency4(0),
    coalDepositSize4(0),
    coalDepositMinAltitude4(0),
    coalDepositMaxAltitude4(0),
    ironDepositRarity1(100),
    ironDepositFrequency1(20),
    ironDepositSize1(8),
    ironDepositMinAltitude1(0),
    ironDepositMaxAltitude1(64),
    ironDepositRarity2(0),
    ironDepositFrequency2(0),
    ironDepositSize2(0),
    ironDepositMinAltitude2(0),
    ironDepositMaxAltitude2(0),
    ironDepositRarity3(0),
    ironDepositFrequency3(0),
    ironDepositSize3(0),
    ironDepositMinAltitude3(0),
    ironDepositMaxAltitude3(0),
    ironDepositRarity4(0),
    ironDepositFrequency4(0),
    ironDepositSize4(0),
    ironDepositMinAltitude4(0),
    ironDepositMaxAltitude4(0),
    goldDepositRarity1(100),
    goldDepositFrequency1(2),
    goldDepositSize1(8),
    goldDepositMinAltitude1(0),
    goldDepositMaxAltitude1(32),
    goldDepositRarity2(0),
    goldDepositFrequency2(0),
    goldDepositSize2(0),
    goldDepositMinAltitude2(0),
    goldDepositMaxAltitude2(0),
    goldDepositRarity3(0),
    goldDepositFrequency3(0),
    goldDepositSize3(0),
    goldDepositMinAltitude3(0),
    goldDepositMaxAltitude3(0),
    goldDepositRarity4(0),
    goldDepositFrequency4(0),
    goldDepositSize4(0),
    goldDepositMinAltitude4(0),
    goldDepositMaxAltitude4(0),
    redstoneDepositRarity1(100),
    redstoneDepositFrequency1(8),
    redstoneDepositSize1(7),
    redstoneDepositMinAltitude1(0),
    redstoneDepositMaxAltitude1(16),
    redstoneDepositRarity2(0),
    redstoneDepositFrequency2(0),
    redstoneDepositSize2(0),
    redstoneDepositMinAltitude2(0),
    redstoneDepositMaxAltitude2(0),
    redstoneDepositRarity3(0),
    redstoneDepositFrequency3(0),
    redstoneDepositSize3(0),
    redstoneDepositMinAltitude3(0),
    redstoneDepositMaxAltitude3(0),
    redstoneDepositRarity4(0),
    redstoneDepositFrequency4(0),
    redstoneDepositSize4(0),
    redstoneDepositMinAltitude4(0),
    redstoneDepositMaxAltitude4(0),
    diamondDepositRarity1(100),
    diamondDepositFrequency1(1),
    diamondDepositSize1(7),
    diamondDepositMinAltitude1(0),
    diamondDepositMaxAltitude1(16),
    diamondDepositRarity2(0),
    diamondDepositFrequency2(0),
    diamondDepositSize2(0),
    diamondDepositMinAltitude2(0),
    diamondDepositMaxAltitude2(0),
    diamondDepositRarity3(0),
    diamondDepositFrequency3(0),
    diamondDepositSize3(0),
    diamondDepositMinAltitude3(0),
    diamondDepositMaxAltitude3(0),
    diamondDepositRarity4(0),
    diamondDepositFrequency4(0),
    diamondDepositSize4(0),
    diamondDepositMinAltitude4(0),
    diamondDepositMaxAltitude4(0),
    lapislazuliDepositRarity1(100),
    lapislazuliDepositFrequency1(1),
    lapislazuliDepositSize1(7),
    lapislazuliDepositMinAltitude1(0),
    lapislazuliDepositMaxAltitude1(16),
    lapislazuliDepositRarity2(0),
    lapislazuliDepositFrequency2(0),
    lapislazuliDepositSize2(0),
    lapislazuliDepositMinAltitude2(0),
    lapislazuliDepositMaxAltitude2(0),
    lapislazuliDepositRarity3(0),
    lapislazuliDepositFrequency3(0),
    lapislazuliDepositSize3(0),
    lapislazuliDepositMinAltitude3(0),
    lapislazuliDepositMaxAltitude3(0),
    lapislazuliDepositRarity4(0),
    lapislazuliDepositFrequency4(0),
    lapislazuliDepositSize4(0),
    lapislazuliDepositMinAltitude4(0),
    lapislazuliDepositMaxAltitude4(0),

    lavaSourceHellDepositRarity(100),
    lavaSourceHellDepositFrequency(8),
    lavaSourceHellDepositMinAltitude(4),
    lavaSourceHellDepositMaxAltitude(124),
    fireHellDepositRarity(100),
    fireHellDepositFrequency(10),
    fireHellDepositMinAltitude(4),
    fireHellDepositMaxAltitude(124),
    lightstoneHellDepositRarity1(100),
    lightstoneHellDepositFrequency1(10),
    lightstoneHellDepositMinAltitude1(4),
    lightstoneHellDepositMaxAltitude1(124),
    lightstoneHellDepositRarity2(100),
    lightstoneHellDepositFrequency2(10),
    lightstoneHellDepositMinAltitude2(0),
    lightstoneHellDepositMaxAltitude2(128),
    brownMushroomHellDepositRarity(100),
    brownMushroomHellDepositFrequency(1),
    brownMushroomHellDepositMinAltitude(0),
    brownMushroomHellDepositMaxAltitude(128),
    redMushroomHellDepositRarity(100),
    redMushroomHellDepositFrequency(1),
    redMushroomHellDepositMinAltitude(0),
    redMushroomHellDepositMaxAltitude(128),

    evenWaterSourceDistribution(false),
    evenLavaSourceDistribution(false);

    

    private int iValue;
    private double dValue;
    private String sValue;
    private boolean bValue;

    private BiomeTerrainValues(int i)
    {
        this.iValue = i;
    }

    private BiomeTerrainValues(double d)
    {
        this.dValue = d;
    }

    private BiomeTerrainValues(String s)
    {
        this.sValue = s;
    }

    private BiomeTerrainValues(Boolean b)
    {
        this.bValue = b;
    }


    public int intValue()
    {
        return this.iValue;
    }

    public double doubleValue()
    {
        return this.dValue;
    }

    public String stringValue()
    {
        return this.sValue;
    }


    public Boolean booleanValue()
    {
        return this.bValue;
    }

}