package com.lemon.cloud.core.serializer;

public class JavaSerializer implements MetadataSerializer {
  /**
   * Serialize byte [ ].
   *
   * @param obj the obj
   * @return the byte [ ]
   * @throws TransactionException the transaction exception
   */
  @Override
  public byte[] serialize(Object obj) throws Exception {
    return new byte[0];
  }

  /**
   * De serialize t.
   *
   * @param param the param
   * @param clazz the clazz
   * @return the t
   * @throws TransactionException the transaction exception
   */
  @Override
  public <T> T deserialize(byte[] param, Class<T> clazz) throws Exception {
    return null;
  }
}
