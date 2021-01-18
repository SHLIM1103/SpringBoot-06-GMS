package com.example.demo.cop.bbs.service;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QReply is a Querydsl query type for Reply
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QReply extends EntityPathBase<Reply> {

    private static final long serialVersionUID = 1480534706L;

    public static final QReply reply = new QReply("reply");

    public final QArticle _super = new QArticle(this);

    public final NumberPath<Integer> artNum = createNumber("artNum", Integer.class);

    public final StringPath content = createString("content");

    //inherited
    public final StringPath count = _super.count;

    public final NumberPath<Integer> replyNum = createNumber("replyNum", Integer.class);

    //inherited
    public final StringPath title = _super.title;

    //inherited
    public final NumberPath<Integer> writerNum = _super.writerNum;

    public QReply(String variable) {
        super(Reply.class, forVariable(variable));
    }

    public QReply(Path<? extends Reply> path) {
        super(path.getType(), path.getMetadata());
    }

    public QReply(PathMetadata metadata) {
        super(Reply.class, metadata);
    }

}

