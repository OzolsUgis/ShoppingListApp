package com.ugisozols.shoppinglistapp.domain.models

/**
 * [Category] contains data of each category available in this application
 *
 * Each category have a name property
 *
 * @param name of type [String] contains category name
 */
sealed class Category(val name : String)  {
    object General : Category("general")
    object Food : Category("food")
    object House : Category("house")
    object Garden : Category("garden")
    object Medicine : Category("medicine")
    object Travel : Category("travel")
    object Car : Category("car")





    companion object {

        /**
         *  [fromString] function is member of [Category] class so we can
         *  return category from category name of type [String]
         *
         *  @param name of Type [String] contains name
         *  @return specific [Category] from category name
         */

        fun fromString(name: String): Category {
            return when(name) {
                "general" -> General
                "food" -> Food
                "house" -> House
                "garden" -> Garden
                "medicine" -> Medicine
                "travel" -> Travel
                "car" -> Car
                else -> General
            }
        }
    }
}
