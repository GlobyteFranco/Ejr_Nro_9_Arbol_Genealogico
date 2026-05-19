package models;

import java.util.LinkedList;
import java.util.Queue;

public class FamilyTree {// Responsable de recorrer el arbol
    private Relative root;
    Queue<Relative> queueRelatives = new LinkedList<>();

    public FamilyTree(Relative root) {
        this.root = root;
    }

    public Relative getRoot() {
        return root;
    }

    public boolean checkLineageCondition() {
        Queue<Relative> wrapperQueueRelatives = new LinkedList<>();
        wrapperQueueRelatives.add(root);
        return checkLineageCondition(wrapperQueueRelatives, 0);
    }

    private boolean checkLineageCondition(Queue<Relative> queue, int level) {
        int queueSize = queue.size();
        int lineageCounter = 0;
        for (int index = 0; index < queueSize; index++) {
            Relative relative = queue.poll();

            if (relative.getNationalitie() == Nationalities.ITALIANA) {
                lineageCounter += 1;
                if (lineageCounter >= level) {
                    return true;
                }
            }
            relative.getRelativeA().ifPresent(relativeParam -> queue.add(relativeParam));
            relative.getRelativeB().ifPresent(relativeParam -> queue.add(relativeParam));

        }
        if (!queue.isEmpty()) {
            return checkLineageCondition(queue, level + 1);
        }

        return false;
    }

    public void addRelative(Relative relativeReceived) {
        if (this.root == null) {
            this.root = relativeReceived;
            queueRelatives.add(relativeReceived);
        } else {
            queueRelatives.add(relativeReceived);
            if (queueRelatives.size() > 1) {
                Relative relative = queueRelatives.peek();
                if (relative.getRelativeA().isEmpty()) {
                    relative.setRelativeA(relativeReceived);
                } else {
                    relative.setRelativeB(relativeReceived);
                    queueRelatives.poll();
                }

            }
        }

    }

}
