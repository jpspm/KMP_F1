package com.f1.view.components.driverstanding

data class DriverPointsData(
    val lastName: String,
    val team: String,
    val points: String,
    val nation: String,
    val color: Long,
    val image: String
)

val sampleDriverPointsList = listOf(
    DriverPointsData(
        lastName = "Verstappen",
        team = "Red Bull Racing",
        points = "0",
        nation = "NED",
        color = 0xFF3671C6,
        image = "https://media.formula1.com/d_driver_fallback_image.png/content/dam/fom-website/drivers/M/MAXVER01_Max_Verstappen/maxver01.png"
    ),
    DriverPointsData(
        lastName = "Norris",
        team = "McLaren",
        points = "0",
        nation = "GBR",
        color = 0xFFFF8000,
        image = "https://media.formula1.com/d_driver_fallback_image.png/content/dam/fom-website/drivers/L/LANNOR01_Lando_Norris/lannor01.png"
    ),
    DriverPointsData(
        lastName = "Bortoleto",
        team = "Kick Sauber",
        points = "0",
        nation = "BRA",
        color = 0xFF52E252,
        image = "https://media.formula1.com/d_driver_fallback_image.png/content/dam/fom-website/drivers/G/GABBOR01_Gabriel_Bortoleto/gabbor01.png"
    ),
    DriverPointsData(
        lastName = "Hadjar",
        team = "Racing Bulls",
        points = "0",
        nation = "FRA",
        color = 0xFF6692FF,
        image = "https://media.formula1.com/d_driver_fallback_image.png/content/dam/fom-website/drivers/I/ISAHAD01_Isack_Hadjar/isahad01.png"
    ),
    DriverPointsData(
        lastName = "Doohan",
        team = "Alpine",
        points = "0",
        nation = "",
        color = 0xFF0093CC,
        image = "https://media.formula1.com/d_driver_fallback_image.png/content/dam/fom-website/drivers/J/JACDOO01_Jack_Doohan/jacdoo01.png"
    ),
    DriverPointsData(
        lastName = "Gasly",
        team = "Alpine",
        points = "0",
        nation = "FRA",
        color = 0xFF0093CC,
        image = "https://media.formula1.com/d_driver_fallback_image.png/content/dam/fom-website/drivers/P/PIEGAS01_Pierre_Gasly/piegas01.png"
    ),
    DriverPointsData(
        lastName = "Antonelli",
        team = "Mercedes",
        points = "0",
        nation = "ITA",
        color = 0xFF27F4D2,
        image = "https://media.formula1.com/d_driver_fallback_image.png/content/dam/fom-website/drivers/A/ANDANT01_Andrea%20Kimi_Antonelli/andant01.png"
    ),
    DriverPointsData(
        lastName = "Alonso",
        team = "Aston Martin",
        points = "0",
        nation = "ESP",
        color = 0xFF229971,
        image = "https://media.formula1.com/d_driver_fallback_image.png/content/dam/fom-website/drivers/F/FERALO01_Fernando_Alonso/feralo01.png"
    ),
    DriverPointsData(
        lastName = "Leclerc",
        team = "Ferrari",
        points = "0",
        nation = "MON",
        color = 0xFFE80020,
        image = "https://media.formula1.com/d_driver_fallback_image.png/content/dam/fom-website/drivers/C/CHALEC01_Charles_Leclerc/chalec01.png"
    ),
    DriverPointsData(
        lastName = "Stroll",
        team = "Aston Martin",
        points = "0",
        nation = "CAN",
        color = 0xFF229971,
        image = "https://media.formula1.com/d_driver_fallback_image.png/content/dam/fom-website/drivers/L/LANSTR01_Lance_Stroll/lanstr01.png"
    ),
    DriverPointsData(
        lastName = "Tsunoda",
        team = "Red Bull Racing",
        points = "0",
        nation = "JPN",
        color = 0xFF3671C6,
        image = "https://media.formula1.com/d_driver_fallback_image.png/content/dam/fom-website/drivers/Y/YUKTSU01_Yuki_Tsunoda/yuktsu01.png"
    ),
    DriverPointsData(
        lastName = "Albon",
        team = "Williams",
        points = "0",
        nation = "THA",
        color = 0xFF64C4FF,
        image = "https://media.formula1.com/d_driver_fallback_image.png/content/dam/fom-website/drivers/A/ALEALB01_Alexander_Albon/alealb01.png"
    ),
    DriverPointsData(
        lastName = "Hulkenberg",
        team = "Kick Sauber",
        points = "0",
        nation = "GER",
        color = 0xFF52E252,
        image = "https://media.formula1.com/d_driver_fallback_image.png/content/dam/fom-website/drivers/N/NICHUL01_Nico_Hulkenberg/nichul01.png"
    ),
    DriverPointsData(
        lastName = "Lawson",
        team = "Racing Bulls",
        points = "0",
        nation = "",
        color = 0xFF6692FF,
        image = "https://media.formula1.com/d_driver_fallback_image.png/content/dam/fom-website/drivers/L/LIALAW01_Liam_Lawson/lialaw01.png"
    ),
    DriverPointsData(
        lastName = "Ocon",
        team = "Haas F1 Team",
        points = "0",
        nation = "FRA",
        color = 0xFFB6BABD,
        image = "https://media.formula1.com/d_driver_fallback_image.png/content/dam/fom-website/drivers/E/ESTOCO01_Esteban_Ocon/estoco01.png"
    ),
    DriverPointsData(
        lastName = "Hamilton",
        team = "Ferrari",
        points = "0",
        nation = "GBR",
        color = 0xFFE80020,
        image = "https://media.formula1.com/d_driver_fallback_image.png/content/dam/fom-website/drivers/L/LEWHAM01_Lewis_Hamilton/lewham01.png"
    ),
    DriverPointsData(
        lastName = "Sainz",
        team = "Williams",
        points = "0",
        nation = "ESP",
        color = 0xFF64C4FF,
        image = "https://media.formula1.com/d_driver_fallback_image.png/content/dam/fom-website/drivers/C/CARSAI01_Carlos_Sainz/carsai01.png"
    ),
    DriverPointsData(
        lastName = "Russell",
        team = "Mercedes",
        points = "0",
        nation = "GBR",
        color = 0xFF27F4D2,
        image = "https://media.formula1.com/d_driver_fallback_image.png/content/dam/fom-website/drivers/G/GEORUS01_George_Russell/georus01.png"
    ),
    DriverPointsData(
        lastName = "Piastri",
        team = "McLaren",
        points = "0",
        nation = "AUS",
        color = 0xFFFF8000,
        image = "https://media.formula1.com/d_driver_fallback_image.png/content/dam/fom-website/drivers/O/OSCPIA01_Oscar_Piastri/oscpia01.png"
    ),
    DriverPointsData(
        lastName = "Bearman",
        team = "Haas F1 Team",
        points = "0",
        nation = "",
        color = 0xFFB6BABD,
        image = "https://media.formula1.com/d_driver_fallback_image.png/content/dam/fom-website/drivers/O/OLIBEA01_Oliver_Bearman/olibea01.png"
    )
)
