package com.lemon.cloud.core.serializer;

import com.lemon.cloud.core.annotation.SerializerSpi;

import java.io.Serializable;

/**
 * @author marklin
 */
@SerializerSpi
public interface ObjectSerializer extends Serializable {
    /**
     * Serialize byte [ ].
     *
     * @param obj the obj
     * @return the byte [ ]
     * @throws TransactionException the transaction exception
     */
    byte[] serialize(Object obj) throws Exception;

    /**
     * De serialize t.
     *
     * @param <T>   the type parameter
     * @param param the param
     * @param clazz the clazz
     * @return the t
     * @throws TransactionException the transaction exception
     */
    <T> T deSerialize(byte[] param, Class<T> clazz) throws Exception;
}
