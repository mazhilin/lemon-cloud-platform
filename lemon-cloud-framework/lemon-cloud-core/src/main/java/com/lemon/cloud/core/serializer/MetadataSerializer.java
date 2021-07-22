package com.lemon.cloud.core.serializer;

import com.lemon.cloud.core.annotation.SerializerSpi;

@SerializerSpi
public interface MetadataSerializer {
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
    <T> T deserialize(byte[] param, Class<T> clazz) throws Exception;
}
