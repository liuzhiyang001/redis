package jedis.tool;

import com.dyuproject.protostuff.LinkedBuffer;
import com.dyuproject.protostuff.ProtostuffIOUtil;
import com.dyuproject.protostuff.Schema;
import com.dyuproject.protostuff.runtime.RuntimeSchema;
import jedis.pojo.User;

/**
 * @ Author     ：lzy
 * @ Date       ：Created in  2019/4/30 14:48
 * @ Description：
 */
public class ProtostuffSerializer {

    private Schema<User> schema = RuntimeSchema.createFrom(User.class);

    public byte[] serialize(final User User) {
        final LinkedBuffer buffer = LinkedBuffer.allocate(LinkedBuffer.DEFAULT_BUFFER_SIZE); try {
            return serializeInternal(User, schema, buffer);
        } catch (final Exception e) {
            throw new IllegalStateException(e.getMessage(), e);
        } finally {
            buffer.clear();
        }
    }

    public User deserialize(final byte[] bytes) {
        try {
            User User = deserializeInternal(bytes, schema.newMessage(), schema);
            if (User != null) {
                return User;
            }
        } catch (final Exception e) {
            throw new IllegalStateException(e.getMessage(), e);
        }
        return null;
    }

    private <T> byte[] serializeInternal(final T source, final Schema<T> schema, final LinkedBuffer buffer) {
        return ProtostuffIOUtil.toByteArray(source, schema, buffer);
    }

    private <T> T deserializeInternal(final byte[] bytes, final T result, final Schema<T> schema) {
        ProtostuffIOUtil.mergeFrom(bytes, result, schema);
        return result;
    }
}
