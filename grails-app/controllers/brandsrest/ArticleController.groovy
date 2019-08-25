package brandsrest

import grails.converters.JSON
import grails.rest.RestfulController

class ArticleController extends RestfulController<Article>{
    static responseFormats = ['json']

    ArticleController() {
        super(Article)
    }

    @Override
    def index() {
        def brandsId = params.brandsId
        if(brandsId != null) {
            respond Article.where {
                brand.id == brandsId
            }.list()
        } else {
            respond Article.list()
        }
    }

}
