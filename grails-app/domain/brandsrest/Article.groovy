package brandsrest

class Article {

    String name
    String picture
    String total_items_in_this_category
    static belongsTo = [brand: Brands]

    static constraints = {
        name nullable: false, blank: false
        picture nullable: false, blank: false
        total_items_in_this_category nullable: false, blank: false
    }
}
