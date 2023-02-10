import javax.management.relation.RoleStatus;

public class treeNode {
    void inOrder(treeNode t) {
        if (t.left != null) {
            inOrder(t.left);
        }
        System.out.println(t.data);
        if (t.right != null) {
            inOrder(t.night);
        }
    }

    void inOrder(treeNode root){
        treeNode p;
        stack s;
        s.init();
        p=root;
        repeat{
            while(p!=null){
                s.push(p);
                p=p.left;

            }
            if(s.isItEmpty()==false){
                p=s.pop();
                System.out.println(p.data);
                p=p.right;
            }
        } until((p==null) && (isItEmpty==true));
    }

}
