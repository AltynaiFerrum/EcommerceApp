package com.jyldyzferr.ecommerceapp.data.fake_data

import com.jyldyzferr.ecommerceapp.domain.models.All
import com.jyldyzferr.ecommerceapp.domain.models.Featured
import com.jyldyzferr.ecommerceapp.domain.models.ItemCategory
import com.jyldyzferr.ecommerceapp.domain.models.RecommendationsEvent
import java.util.UUID

class FakeData {
    companion object {

        fun fakeItemCategory() = listOf(
            ItemCategory(
                id = UUID.randomUUID().toString(),
                title = "Electronics",
                imageUrl = "https://images.unsplash.com/photo-1588508065123-287b28e013da?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=1287&q=80"
            ),
            ItemCategory(
                id = UUID.randomUUID().toString(),
                title = "Musics",
                imageUrl = "https://images.unsplash.com/photo-1460036521480-ff49c08c2781?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=1173&q=80",
            ),
            ItemCategory(
                id = UUID.randomUUID().toString(),
                title = "Fashion",
                imageUrl = "https://images.unsplash.com/photo-1492707892479-7bc8d5a4ee93?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=765&q=80"
            ),
            ItemCategory(
                id = UUID.randomUUID().toString(),
                title = "Digital service",
                imageUrl = "https://images.unsplash.com/photo-1451187580459-43490279c0fa?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=1172&q=80",
            ),
            ItemCategory(
                id = UUID.randomUUID().toString(),
                title = "Fashion",
                imageUrl = "https://images.unsplash.com/photo-1509631179647-0177331693ae?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=1288&q=80",
            ),
            ItemCategory(
                id = UUID.randomUUID().toString(),
                title = "Digital service",
                imageUrl = "https://images.unsplash.com/photo-1504270997636-07ddfbd48945?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=1171&q=80",
            ),
        )

        fun fakeFeatured() = listOf(
            Featured(
                id = UUID.randomUUID().toString(),
                title = "Sport Band",
                imageUrl = "https://images.unsplash.com/photo-1535223289827-42f1e9919769?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=687&q=80",
                price = "$5696"
            ),
            Featured(
                id = UUID.randomUUID().toString(),
                title = "Headphones",
                imageUrl = "https://images.unsplash.com/photo-1505740420928-5e560c06d30e?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=1170&q=80",
                price = "$2499"
            ),
            Featured(
                id = UUID.randomUUID().toString(),
                title = "Lenovo Laptop",
                imageUrl = "https://images.unsplash.com/photo-1503437313881-503a91226402?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=1332&q=80",
                price = "$4099"
            ),
            Featured(
                id = UUID.randomUUID().toString(),
                title = "MacBook Air",
                imageUrl = "https://images.unsplash.com/photo-1496171367470-9ed9a91ea931?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=1170&q=80",
                price = "$78000"
            ),
        )

        fun fakeAll() = listOf(
            All(
                id = UUID.randomUUID().toString(),
                title = "Social Media App",
                description = "Flavorful chicken broth, crunchy chopped onions, earthy mushrooms, and savory spices all come together to create the most perfect chicken dish ever. Recipe creator Faith recommends that to really take this dish to the next level, it can be served with mushroom rice and asparagus.",
                imageUrl = "https://images.unsplash.com/photo-1611162617213-7d7a39e9b1d7?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=1074&q=80",
                price = "$6559"
            ),
            All(
                id = UUID.randomUUID().toString(),
                title = "Iphone",
                description = "This Johnny Marzetti Casserole is one top-tier dish that you simply won't be able to get enough of. From the tender rotini pasta, zesty ground beef, and delectable veggies, this recipe isn't just bursting with flavor but is the perfect winter meal to make.",
                imageUrl = "https://images.unsplash.com/photo-1483478550801-ceba5fe50e8e?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=1170&q=80",
                price = "$3440"
            ),
            All(
                id = UUID.randomUUID().toString(),
                title = "Million Dollar Chicken Casserole",
                description = "Another high-quality casserole that was a hit with our audience was this Million Dollar Chicken. Whether you're looking for a hearty casserole to make for your family or looking to change up your dinner plans, this is the ideal dish because, with each bite, you'll be tasting tender pieces of rotisserie chicken, mozzarella cheese, scallions, and pure comfort.",
                imageUrl = "https://images.unsplash.com/photo-1472393365320-db77a5abbecc?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=1170&q=80",
                price = "$5643"
            ),
            All(
                id = UUID.randomUUID().toString(),
                title = "Digital",
                description = "Leave your dinner guests speechless with this appetizing Spaghetti Carbonara! Whether you're just diving into the world of tantalizing pasta dishes or are a seasoned pro, you can't argue with the deliciousness of creamy pasta.",
                imageUrl = "https://images.unsplash.com/photo-1504610926078-a1611febcad3?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=1480&q=80",
                price = "$780"
            ),
            All(
                id = UUID.randomUUID().toString(),
                title = "The Secret to It",
                description = "With our secret to fluffy scrambled eggs, you'll never have to worry about making burnt eggs ever again. And once you're through making these fluffy eggs, top them with the herb of your choice.",
                imageUrl = "https://images.unsplash.com/photo-1538391543564-047a76156421?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=1365&q=80",
                price = "$5640"


            ),
            All(
                id = UUID.randomUUID().toString(),
                title = "Drone",
                description = "There's no better way to get your morning started than with a warm cinnamon roll that's been topped with sweet, gooey icing. Not only is our recipe better than the store-bought ones but they go great with a warm cup of coffee.",
                imageUrl = "https://images.unsplash.com/photo-1473968512647-3e447244af8f?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=1170&q=80",
                price = "$5010"
            ),
        )

        fun fakeRecommendationsEvent() = listOf(
            RecommendationsEvent(
                id = UUID.randomUUID().toString(),
                title = "Best rated techs",
                imageUrl = "https://images.unsplash.com/photo-1531297484001-80022131f5a1?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=1420&q=80"
            ),
            RecommendationsEvent(
                id = UUID.randomUUID().toString(),
                title = "Our 10 Most Popular Electronics You Loved in 2021",
                imageUrl = "https://images.unsplash.com/photo-1671726203454-5d7a5370a9f4?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=1170&q=80"
            ),
            RecommendationsEvent(
                id = UUID.randomUUID().toString(),
                title = "Our 20 Most Popular sports of 2022",
                imageUrl = "https://plus.unsplash.com/premium_photo-1677443052580-90a2fe65cec8?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=1332&q=80"
            ),
            RecommendationsEvent(
                id = UUID.randomUUID().toString(),
                title = "Tech 2023",
                imageUrl = "https://images.unsplash.com/photo-1488590528505-98d2b5aba04b?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=1170&q=80"
            ),
        )
    }
}


