package chain.better;

import chain.Member;

public abstract class Handler {
    protected Handler chain;

    public void next(Handler handler) {
        this.chain = handler;
    }

    public abstract void doHandler(Member member);


    public static class Builder<T> {
        private Handler head;
        private Handler tail;

        public Builder<T> addHandler(Handler handler) {
            if (this.head == null) {
                this.head = this.tail = handler;
            }
            this.tail.next(handler);
            this.tail = handler;
            return this;
        }

        public Handler build() {
            return this.head;
        }
    }
}
